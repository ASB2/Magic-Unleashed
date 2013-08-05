package MU.api.essence;

import java.util.EnumSet;

import net.minecraft.item.ItemStack;

public interface IEssenceItem {

    EnumSet<EssenceType> getEssenceValue(ItemStack itemStack);
    
}
