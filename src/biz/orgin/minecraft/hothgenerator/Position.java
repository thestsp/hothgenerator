package biz.orgin.minecraft.hothgenerator;

/**
 * Simple class for holding coordinates. Uses a custom hasCode for
 * quick lookup in a set. Used mainly by the CavePopulator.
 * @author orgin
 *
 */
public class Position
{
	public int x,y,z;
	public int type;
	public byte data;
	public int lootMin;
	public int lootMax;
	public LootGenerator lootGenerator;
	
	public Position(int x, int y, int z, int type)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.type = type;
		this.data = 0;
		this.lootMin = 0;
		this.lootMax = 0;
		this.lootGenerator = null;

	}

	public Position(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.type = 0;
		this.data = 0;
		this.lootMin = 0;
		this.lootMax = 0;
		this.lootGenerator = null;
	}

	public Position()
	{
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.type = 0;
		this.data = 0;
		this.lootMin = 0;
		this.lootMax = 0;
		this.lootGenerator = null;
	}

	@Override
	public int hashCode()
	{
		int result = 1;
		result = 43 * result + x;
		result = 43 * result + y;
		result = 43 * result + z;
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null || !(obj instanceof Position))
		{
			return false;
		}
		Position other = (Position) obj;
		if (x != other.x || y != other.y || z != other.z)
		{
			return false;
		}
		return true;
	}
}
