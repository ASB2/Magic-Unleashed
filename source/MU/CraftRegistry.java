package MU;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftRegistry {

    public static void init() {

        GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.BlockTopazBrick), new ItemStack(ItemRegistry.ItemTopaz));
        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.ItemTopaz), new ItemStack(BlockRegistry.BlockTopazBrick));
    }

}
