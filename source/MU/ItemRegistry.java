package MU;

import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import MU.utils.Reference;
import cpw.mods.fml.common.registry.LanguageRegistry;
import MU.items.*;

public class ItemRegistry {

    public static EnumToolMaterial toolTopaz = EnumHelper.addToolMaterial("TOPAZ", 2, 200, 10.0F, 2.0F, 30);

    public static ItemBase ItemTestItem;

    private static int id = 5000;
    
    public static void init(Configuration config) {
        
        ItemTestItem = new ItemTestItem(config.getItem("ItemTestItem", ItemRegistry.getNextBaseID()).getInt());
        ItemTestItem.setUnlocalizedName(Reference.UNIQUE_NAME+"ItemAirCrystalShard");
        LanguageRegistry.addName(ItemTestItem, "Test Item");
    }

    public static int getNextBaseID() {

        return id++;
    }
}
