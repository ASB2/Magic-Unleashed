package MU.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import MU.ItemRegistry;
import MU.info.Reference;

public class BlockTopazOre extends BlockBase {

    public BlockTopazOre(int id, Material material) {
        super(id, material);
    }

    @Override
    public void registerIcons(IconRegister iconRegister) {

        blockIcon = iconRegister.registerIcon(Reference.MODDID + ":BlockTopazOre");
    }
    
    public int idDropped(int par1, Random ramdon, int par3) {

        return ItemRegistry.ItemTopaz.itemID;
    }
}
