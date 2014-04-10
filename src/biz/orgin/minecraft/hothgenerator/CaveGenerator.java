package biz.orgin.minecraft.hothgenerator;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;

/**
 * A general cave generator. Generates simple twisting strands of empty caves.
 * Only generates caves in loaded chunks.
 * @author orgin
 *
 */
public class CaveGenerator {
	
	private static int blocksPerInteration = 200;

	public static void generateCaves(HothGeneratorPlugin plugin, World world, Random random, int chunkX, int chunkZ)
	{
		int rarity = plugin.getGenerateCavesRarity();
		
		if(rarity!=0)
		{
			int doit = random.nextInt(128*rarity);
			if(doit == 73)
			{
				final int x = 4 + random.nextInt(8) + chunkX * 16;
				final int z = 4 + random.nextInt(8) + chunkZ * 16;
				
				final int y = random.nextInt(32);
				
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new PlaceCave(plugin, world, random, x, y, z));

				if (random.nextInt(16) > 5) {
					if (y > 36) {
						Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new PlaceCave(plugin, world, random, x, y / 2, z));
					} else if (y < 24) {
						Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new PlaceCave(plugin, world, random, x, y * 2, z));
					}
				}
			}
		}
	}
	
	static class PlaceCave implements Runnable
	{
		private final World world;
		private final int x;
		private final int y;
		private final int z;
		private Random random;
		private HothGeneratorPlugin plugin;

		public PlaceCave(HothGeneratorPlugin plugin, World world, Random random, int x, int y, int z)
		{
			this.world = world;
			this.x = x;
			this.y = y;
			this.z = z;
			this.random = random;
			this.plugin = plugin;
		}

		@Override
		public void run()
		{
			Position[] snake = startCave(world, this.random, x, y, z).toArray(new Position[0]);
			finishCave(plugin, world, snake);
		}
	}

	/*
	 * Check if a position contains air or is not loaded yet. Must not render caves in unloaded chunks.
	 */
	private static boolean isEmpty(World world, int x, int y, int z)
	{
		if(!world.isChunkLoaded(x/16, z/16))
		{
			return true;
		}
		else
		{
			return world.getBlockAt(x, y, z).getType().equals(Material.AIR);
		}
	}

	/*
	 * Check the type at position. If chunk is not loaded treat position as air. Must not render caves in unloaded chunks.
	 */
	private static int getTypeAt(World world, int x, int y, int z)
	{
		if(!world.isChunkLoaded(x/16, z/16))
		{
			return 0;
		}
		else
		{
			return MaterialManager.toID(world.getBlockAt(x, y, z).getType());
		}
	}

	
	private static Set<Position> startCave(World world, Random random, int blockX, int blockY, int blockZ)
	{
		Set<Position> caveBlocks = new HashSet<Position>();
	
		int airHits = 0;
		Position block = new Position();
		while (true) {
			if (airHits > 1024) {
				break;
			}
			
			if (random.nextInt(20) == 0) {
				blockY++;
			} else if (CaveGenerator.isEmpty(world, blockX, blockY + 2, blockZ)) {
				blockY += 2;
			} else if (CaveGenerator.isEmpty(world, blockX + 2, blockY, blockZ)) {
				blockX++;
			} else if (CaveGenerator.isEmpty(world, blockX - 2, blockY, blockZ)) {
				blockX--;
			} else if (CaveGenerator.isEmpty(world, blockX, blockY, blockZ + 2)) {
				blockZ++;
			} else if (CaveGenerator.isEmpty(world, blockX, blockY, blockZ - 2)) {
				blockZ--;
			} else if (CaveGenerator.isEmpty(world, blockX + 1, blockY, blockZ)) {
				blockX++;
			} else if (CaveGenerator.isEmpty(world, blockX - 1, blockY, blockZ)) {
				blockX--;
			} else if (CaveGenerator.isEmpty(world, blockX, blockY, blockZ + 1)) {
				blockZ++;
			} else if (CaveGenerator.isEmpty(world, blockX, blockY, blockZ - 1)) {
				blockZ--;
			} else if (random.nextBoolean()) {
				if (random.nextBoolean()) {
					blockX++;
				} else {
					blockZ++;
				}
			} else {
				if (random.nextBoolean()) {
					blockX--;
				} else {
					blockZ--;
				}
			}
	
			if (!CaveGenerator.isEmpty(world, blockX, blockY, blockZ)) {
				int radius = 1 + random.nextInt(2);
				int radius2 = radius * radius + 1;
				for (int x = -radius; x <= radius; x++) {
					for (int y = -radius; y <= radius; y++) {
						for (int z = -radius; z <= radius; z++) {
							if (x * x + y * y + z * z <= radius2 && y >= 0
									&& y < 128)
							{
								int type = CaveGenerator.getTypeAt(world, blockX + x, blockY	+ y, blockZ + z);
								if (type == 0)
								{
									airHits++;
								}
								else if(type == MaterialManager.toID(Material.SNOW_BLOCK) ||
										type == MaterialManager.toID(Material.PACKED_ICE) ||
										type == MaterialManager.toID(Material.ICE) ||
										type == MaterialManager.toID(Material.SNOW) ||
										type == MaterialManager.toID(Material.STONE))
								{
									block.x = blockX + x;
									block.y = blockY + y;
									block.z = blockZ + z;
									if (caveBlocks.add(block))
									{
										block = new Position();
									}
								}
							}
						}
					}
				}
			} else {
				airHits++;
			}
		}
		
		return caveBlocks;
	}
	
	private static void finishCave(HothGeneratorPlugin plugin, World world, Position[] blocks)
	{
		Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Render(plugin, world, blocks, 0, CaveGenerator.blocksPerInteration));
	}
	
	static class Render implements Runnable
	{
		private final HothGeneratorPlugin plugin;
		private final World world;
		private final Position[] blocks;
		private final int start;
		private final int count;

		public Render(HothGeneratorPlugin plugin, World world, Position[] blocks, int start, int count)
		{
			this.world = world;
			this.blocks = blocks;
			this.start = start;
			this.count = count;
			this.plugin = plugin;
		}
		
		@Override
		public void run()
		{
			Position[] blocks = this.blocks;
			int start = this.start;
			int count = this.count;
			
			for(int i=start;i<start+count && i<blocks.length;i++)
			{
				Position pos = blocks[i];
				
				Block block = world.getBlockAt(pos.x, pos.y, pos.z);
				Material type = block.getType();
				if (!block.isEmpty() &&
					(type.equals(Material.SNOW_BLOCK) ||
					 type.equals(Material.PACKED_ICE) ||
					 type.equals(Material.STONE) ||
					 type.equals(Material.ICE) ||
					 type.equals(Material.SNOW) ))
				{
					block.setType(Material.AIR);
				}				
			}
			if(start+count < blocks.length)
			{
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Render(this.plugin, this.world, blocks, start+count, count));
			}
		}
	}

}
