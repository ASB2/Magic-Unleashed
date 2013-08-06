package MU.items;

import java.util.EnumSet;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import MU.NBTHelper;
import MU.api.essence.EssenceType;
import MU.api.essence.IEssenceItem;
import MU.info.Reference;

public class ItemEssence extends ItemBase implements IEssenceItem {

    String essence = "essence";

    public ItemEssence(int id) {
        super(id);
    }

    @Override
    public void registerIcons(IconRegister iconRegister) {

        itemIcon = iconRegister.registerIcon(Reference.MODDID + ":ItemEssence");
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer player, java.util.List info, boolean unknown) {        
        super.addInformation(itemStack, player, info, unknown);

        for(int i = 0; i < getEssenceValue(itemStack).toArray().length; i++) {

            EssenceType type = (EssenceType)getEssenceValue(itemStack).toArray()[i];

            info.add("Essence Value: " + type.toString());
        }

    }

    public void setEssence(ItemStack itemStack, EssenceType type) {

        NBTTagCompound compound = NBTHelper.getTAGfromItemstack(itemStack);

        if(compound != null) {

            compound.setInteger(essence, EssenceType.translateEssenceTypeToInt(type));
        }
    }

    @Override
    public EnumSet<EssenceType> getEssenceValue(ItemStack itemStack) {

        NBTTagCompound compound = NBTHelper.getTAGfromItemstack(itemStack);

        if(compound != null) {

            return EnumSet.of(EssenceType.translateIntToEssenceType(compound.getInteger(essence)));
        }
        return EnumSet.of(EssenceType.NONE);
    }

}
