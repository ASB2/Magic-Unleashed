package MU;

import net.minecraft.block.material.Material;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import MU.utils.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import MU.blocks.*;

public class BlockRegistry {

    public static BlockBase BlockTestBlock;

    private static int id = 500;

    public static void init(Configuration config) {

        BlockTestBlock = new BlockTestBlock(config.getBlock("BlockAirCrystalOre", BlockRegistry.getNextBaseID()).getInt(), Material.rock);
        BlockTestBlock.setUnlocalizedName("ASB2_BlockAirCrystalOre");
        GameRegistry.registerBlock(BlockTestBlock, MUItemBlock.class,Reference.UNIQUE_NAME + "BlockTestBlock");
        LanguageRegistry.addName(BlockTestBlock, "Test Block");
        MinecraftForge.setBlockHarvestLevel(BlockTestBlock, "pickaxe", 1);
    }

    public static int getNextBaseID() {        
        
        return id++;
    }
}