package MU.items;

import net.minecraft.client.renderer.texture.IconRegister;
import MU.info.Reference;

public class ItemTopaz extends ItemBase {

    public ItemTopaz(int id) {
        super(id);
    }
    
    @Override
    public void registerIcons(IconRegister iconRegister) {

        itemIcon = iconRegister.registerIcon(Reference.MODDID + ":ItemTopaz");
    }
}
