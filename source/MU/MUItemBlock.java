package MU;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import MU.utils.Reference;

public class MUItemBlock extends ItemBlock {
    
    public MUItemBlock(int id) {
        super(id);
        this.setCreativeTab(MagicUnleashed.tabMU);
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer player, java.util.List info, boolean unknown) {
        
        info.add("From: " + Reference.NAME);
    }
}
