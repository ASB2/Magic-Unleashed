package MU.worldGen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import MU.BlockRegistry;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenBlockTopazOre implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

        if(!world.provider.isHellWorld)
            generateSurface(world, random, chunkX*16, chunkZ*16);
    }

    private void generateSurface(World world, Random random, int blockX, int blockZ) { 

        int Xcoord = blockX + random.nextInt(16);
        int Ycoord = random.nextInt(60);
        int Zcoord = blockZ + random.nextInt(16);

        (new WorldGenMinable(BlockRegistry.BlockTopazOre.blockID, 25)).generate(world, random, Xcoord, Ycoord, Zcoord);
    }
}
