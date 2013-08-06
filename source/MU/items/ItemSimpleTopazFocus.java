package MU.items;

import java.util.EnumSet;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import MU.ItemRegistry;
import MU.api.essence.EssenceManager;
import MU.api.essence.EssenceType;
import MU.api.essence.IEssenceExtractable;
import MU.info.Reference;

public class ItemSimpleTopazFocus extends ItemBase {

    public ItemSimpleTopazFocus(int id) {
        super(id);
        this.setMaxDamage(100);
    }

    @SuppressWarnings({ "rawtypes" })
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int hitX, float hitY, float hitZ, float par10)
    {

        if(player.isSneaking()) {

            if(Block.blocksList[world.getBlockId(x, y, z)].getBlockHardness(world, x, y, z) != -1) {

                if(Block.blocksList[world.getBlockId(x, y, z)] instanceof IEssenceExtractable) {

                    IEssenceExtractable essenceBlock = (IEssenceExtractable)Block.blocksList[world.getBlockId(x, y, z)];

                    for(ItemStack item: essenceBlock.getEssenceItems()) {

                        world.spawnEntityInWorld(new EntityItem(world, x, y, z, item));
                    }
                    world.setBlockToAir(x, y, z);
                }
                else {

                    EnumSet vinillaSet = EssenceManager.getInstance().getVinillaEssenceValue(Block.blocksList[world.getBlockId(x, y, z)]);

                    if(vinillaSet != null) {

                        Random rand = new Random();

                        if(rand.nextInt(100) + 1 > 50) {

                            for(int i = 0; i < vinillaSet.toArray().length; i++) {

                                EssenceType type = (EssenceType)vinillaSet.toArray()[i];

                                if(type != EssenceType.NONE) {

                                    itemStack.damageItem(5, player);

                                    ItemStack tempStack = new ItemStack(ItemRegistry.ItemEssence);

                                    ((ItemEssence)tempStack.getItem()).setEssence(tempStack, type);

                                    if(!world.isRemote) {                            

                                        world.spawnEntityInWorld(new EntityItem(world, x, y, z, tempStack));
                                    }

                                    world.setBlockToAir(x, y, z);
                                } 
                                else {
                                    if(!world.isRemote)
                                        player.addChatMessage("No Essence Value Present");
                                }
                            }
                        }
                        else {

                            if(!world.isRemote)
                                player.addChatMessage("The Essence Extraction Has Failed");
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override
    public void registerIcons(IconRegister iconRegister) {

        itemIcon = iconRegister.registerIcon(Reference.MODDID + ":ItemSimpleTopazFocus");
    }
}
