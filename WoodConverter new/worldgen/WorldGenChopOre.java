package Minecrafter1912.WoodConverter.worldgen;

import java.util.Random;

import Minecrafter1912.WoodConverter.WoodConverter;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenChopOre implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
        switch(world.provider.dimensionId)
        {
        case -1:
            generateNether(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 0:
            generateSurface(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 1:
            generateEnd(world, random, chunkX * 16, chunkZ * 16);
            break;
        }
	}

	private void generateSurface(World world, Random random, int i, int j)
	{
		for(int k = 0; k < 5; k++)//the number is how many times minecraft tries to generate the ore in 1 chunk
		{
			int chopOreXCoord = i + random.nextInt(16);
			int chopOreYCoord = random.nextInt(29);//the number is on which layer the ore spawns and then down to 0
			int chopOreZCoord = j + random.nextInt(16);
			
			(new WorldGenMinable(WoodConverter.chopore.blockID, 6)).generate(world, random, chopOreXCoord, chopOreYCoord, chopOreZCoord);//the number is the number of ores per vein
		}
	}

	private void generateNether(World world, Random random, int i, int j)
	{
	}

	private void generateEnd(World world, Random random, int i, int j)
	{
	}
}