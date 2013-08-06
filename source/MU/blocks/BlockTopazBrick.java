package MU.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import MU.info.Reference;

public class BlockTopazBrick extends BlockBase {

    public BlockTopazBrick(int id, Material material) {
        super(id, material);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void registerIcons(IconRegister iconRegister) {

        blockIcon = iconRegister.registerIcon(Reference.MODDID + ":BlockTopazBrick");
    }
}
