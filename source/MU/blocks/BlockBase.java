package MU.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import MU.MagicUnleashed;

public class BlockBase extends Block {

    public BlockBase(int id, Material material) {
        super(id, material);
        this.setCreativeTab(MagicUnleashed.tabMU);
    }

}
