package biz.orgin.minecraft.hothgenerator.schematic;

public class MiniDome implements Schematic
{
	public static Schematic instance = new MiniDome();
	private static int WIDTH = 17;
	private static int LENGTH = 17;
	private static int HEIGHT = 8;
	private static String name = "MiniDome";
	
	private final int[][][] matrix = new int[][][]
	{
			{  // Floor 0
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,44,44,44,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,5,5,5,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,44,98,109,98,44,-1,-1,-1,-1,-1,-1, 0,0,0,0,0,0,5,0,3,0,5,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,44,109, 0,109,44,-1,-1,-1,-1,-1,-1,0,0,0,0,0,0,5,1,0,0,5,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,44,98,109,98,44,-1,-1,-1,-1,-1,-1, 0,0,0,0,0,0,5,0,2,0,5,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,44,44,44,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,5,5,5,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
			},
			{  // Floor 1
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,44,44,44,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,5,5,5,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,44,98,98,98,98,98,44,-1,-1,-1,-1,-1,  0,0,0,0,0,5,0,0,0,0,0,5,0,0,0,0,0},
				{-1,-1,-1,-1,-1,98,98, 0, 0, 0,98,98,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,44,98, 0, 0, 0, 0, 0,98,44,-1,-1,-1,-1,  0,0,0,0,5,0,0,0,0,0,0,0,5,0,0,0,0},
				{-1,-1,-1,-1,44,98, 0, 0, 0, 0, 0,98,44,-1,-1,-1,-1,  0,0,0,0,5,0,0,0,0,0,0,0,5,0,0,0,0},
				{-1,-1,-1,-1,44,98, 0, 0, 0, 0, 0,98,44,-1,-1,-1,-1,  0,0,0,0,5,0,0,0,0,0,0,0,5,0,0,0,0},
				{-1,-1,-1,-1,-1,98,98, 0, 0, 0,98,98,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,44,98,98,98,98,98,44,-1,-1,-1,-1,-1,  0,0,0,0,0,5,0,0,0,0,0,5,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,44,44,44,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,5,5,5,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
			},
			{  // Floor 2
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,98,98,98,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,98,98, 0, 0, 0,98,98,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,5,5,5,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,98, 0, 0, 0, 0, 0, 0, 0,98,-1,-1,-1,-1,  0,0,0,0,0,5,0,0,0,0,0,5,0,0,0,0,0},
				{-1,-1,-1,-1,98, 0, 0, 0, 0, 0, 0, 0,98,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,98, 0, 0, 0, 0, 0, 0, 0, 0, 0,98,-1,-1,-1,  0,0,0,0,5,0,0,0,0,0,0,0,5,0,0,0,0},
				{-1,-1,-1,98, 0, 0, 0, 0, 0, 0, 0, 0, 0,98,-1,-1,-1,  0,0,0,0,5,0,0,0,0,0,0,0,5,0,0,0,0},
				{-1,-1,-1,98, 0, 0, 0, 0, 0, 0, 0, 0, 0,98,-1,-1,-1,  0,0,0,0,5,0,0,0,0,0,0,0,5,0,0,0,0},
				{-1,-1,-1,-1,98, 0, 0, 0, 0, 0, 0, 0,98,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,98, 0, 0, 0, 0, 0, 0, 0,98,-1,-1,-1,-1,  0,0,0,0,0,5,0,0,0,0,0,5,0,0,0,0,0},
				{-1,-1,-1,-1,-1,98,98, 0, 0, 0,98,98,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,5,5,5,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,98,98,98,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
			},
			{  // Floor 3
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
			},
			{  // Floor 4
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
			},
			{  // Floor 5
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
			},
			{  // Floor 6
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
			},
			{  // Floor 7
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
			}

		};
	
	private MiniDome()
	{
	}
	
	public int getWidth() // Inner
	{
		return MiniDome.WIDTH;
	}
	public int getLength() // Middle
	{
		return MiniDome.LENGTH;
	}
	public int getHeight() // Outer
	{
		return MiniDome.HEIGHT;
	}
	
	public int[][][] getMatrix()
	{
		return this.matrix;
	}

	@Override
	public String getName()
	{
		return MiniDome.name;
	}
}