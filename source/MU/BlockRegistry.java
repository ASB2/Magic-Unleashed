package MU;

import net.minecraft.block.material.Material;
import net.minecraftforge.common.Configuration;
import MU.blocks.BlockBase;
import MU.blocks.BlockTestBlock;
import MU.blocks.BlockTopazOre;
import MU.info.Reference;
import MU.items.MUItemBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockRegistry {

    public static BlockBase BlockTestBlock;
    public static BlockBase BlockTopazOre;

    private static int id = 900;

    public static void init(Configuration config) {

        BlockTestBlock = new BlockTestBlock(config.getBlock("BlockTestBlock", BlockRegistry.getNextBaseID()).getInt(), Material.rock);
        BlockTestBlock.setUnlocalizedName(Reference.UNIQUE_NAME + "BlockTestBlock");
        GameRegistry.registerBlock(BlockTestBlock, MUItemBlock.class, Reference.UNIQUE_NAME + "BlockTestBlock");
        LanguageRegistry.addName(BlockTestBlock, "Test Block");

        BlockTopazOre = new BlockTopazOre(config.getBlock("BlockTopazOre", BlockRegistry.getNextBaseID()).getInt(), Material.rock);
        BlockTopazOre.setUnlocalizedName(Reference.UNIQUE_NAME + "BlockTopazOre");
        GameRegistry.registerBlock(BlockTopazOre, MUItemBlock.class, Reference.UNIQUE_NAME + "BlockTopazOre");
        LanguageRegistry.addName(BlockTopazOre, "Topaz Ore");
    }

    public static int getNextBaseID() {        

        return id++;
    }
}

