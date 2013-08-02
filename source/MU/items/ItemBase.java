package MU.items;

import net.minecraft.item.Item;
import MU.MagicUnleashed;

public class ItemBase extends Item {

    public ItemBase(int id) {
        super(id);
        this.setCreativeTab(MagicUnleashed.tabMU);
    }

}
