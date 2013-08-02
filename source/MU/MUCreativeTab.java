package MU;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MUCreativeTab extends CreativeTabs {

    String name;
    
    public MUCreativeTab(int par1, String name) {
        super(par1, name);
        this.name = name;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex() //The item it displays for your tab
    {
        return 1;
//        return ItemRegistry.ItemEnergyCrystalShard.itemID;
    }
    
    @Override
    public String getTranslatedTabLabel()
    {
        return name;
    }
}
