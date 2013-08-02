package MU.items;

import MU.MagicUnleashed;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase(int id) {
        super(id);
        this.setCreativeTab(MagicUnleashed.tabMU);
    }

}
