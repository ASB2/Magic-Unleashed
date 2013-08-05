package MU.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import MU.MagicUnleashed;
import MU.info.Reference;

public class ItemBase extends Item {

    public ItemBase(int id) {
        super(id);
        this.setCreativeTab(MagicUnleashed.tabMU);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer player, java.util.List info, boolean unknown) {
        
        info.add("From: " + Reference.NAME);
    }
}
