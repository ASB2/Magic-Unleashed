package MU;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.Configuration;
import MU.packets.MUPacketHandler;
import MU.proxy.CommonProxy;
import MU.utils.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MODDID, name = Reference.NAME, version = Reference.VERSION)

@NetworkMod(clientSideRequired = true, serverSideRequired = false, channels={Reference.MOD_CHANNEL}, packetHandler = MUPacketHandler.class)

public class MagicUnleashed {

    @Instance(Reference.MODDID)    

    public static MagicUnleashed instance;

    @SidedProxy(clientSide="MU.proxy.ClientProxy", serverSide="MU.proxy.CommonProxy")

    public static CommonProxy proxy;

    public static CreativeTabs tabMU = new MUCreativeTab(CreativeTabs.getNextID(), Reference.NAME);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {    

        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();

        ItemRegistry.init(config);
        BlockRegistry.init(config);

        config.save();
    }

    @EventHandler
    public void mainInit(FMLInitializationEvent event) {

        proxy.register();
        instance = this;
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        CraftRegistry.init();
    }
}
