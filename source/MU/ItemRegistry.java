package MU;

import MU.info.Reference;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import MU.items.ItemBase;
import MU.items.ItemTestItem;
import cpw.mods.fml.common.registry.LanguageRegistry;
import MU.items.*;

public class ItemRegistry {

    public static EnumToolMaterial toolTopaz = EnumHelper.addToolMaterial("TOPAZ", 2, 200, 10.0F, 2.0F, 30);

    public static ItemBase ItemTestItem;
    public static ItemBase ItemTopaz;
    public static ItemBase ItemEssence;
    public static ItemBase ItemSimpleTopazFocus;
    private static int id = 9000;

    public static void init(Configuration config) {

        ItemTestItem = new ItemTestItem(config.getItem("ItemTestItem", ItemRegistry.getNextBaseID()).getInt());
        ItemTestItem.setUnlocalizedName(Reference.UNIQUE_NAME + "ItemTestItem");
        LanguageRegistry.addName(ItemTestItem, "Test Item");
        
        ItemTopaz = new ItemTopaz(config.getItem("ItemTopaz", ItemRegistry.getNextBaseID()).getInt());
        ItemTopaz.setUnlocalizedName(Reference.UNIQUE_NAME + "ItemTopaz");
        LanguageRegistry.addName(ItemTopaz, "Topaz");
        
        ItemEssence = new ItemEssence(config.getItem("ItemEssence", ItemRegistry.getNextBaseID()).getInt());
        ItemEssence.setUnlocalizedName(Reference.UNIQUE_NAME + "ItemEssence");
        LanguageRegistry.addName(ItemEssence, "Essence");
        
        ItemSimpleTopazFocus = new ItemSimpleTopazFocus(config.getItem("ItemSimpleTopazFocus", ItemRegistry.getNextBaseID()).getInt());
        ItemSimpleTopazFocus.setUnlocalizedName(Reference.UNIQUE_NAME + "ItemSimpleTopazFocus");
        LanguageRegistry.addName(ItemSimpleTopazFocus, "Simple Topaz Focus");
    } 

    public static int getNextBaseID() {

        return id++;
    }
}

