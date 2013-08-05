package MU.api.essence;

import java.util.EnumSet;

import net.minecraft.item.ItemStack;

public interface IEssenceExtractable {

    EnumSet<EssenceType> getEssenceValue(ItemStack itemStack);
    ItemStack[] getEssenceItems();
}
