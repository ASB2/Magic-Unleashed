package MU.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraftforge.common.MinecraftForge;
import MU.MagicUnleashed;
import MU.info.Reference;

public class BlockBase extends Block {

    public BlockBase(int id, Material material) {
        super(id, material);
        this.setCreativeTab(MagicUnleashed.tabMU);
        this.setHardness(5F);
        MinecraftForge.setBlockHarvestLevel(this, "pickaxe", 2);
    }

    @Override
    public void registerIcons(IconRegister iconRegister) {

        blockIcon = iconRegister.registerIcon(Reference.MODDID + ":");
    }
}
