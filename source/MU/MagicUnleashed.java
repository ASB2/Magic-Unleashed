package MU;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.Configuration;
import MU.info.Reference;
import MU.packets.MUPacketHandler;
import MU.proxy.CommonProxy;
import MU.worldGen.WorldGenBlockTopazOre;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODDID, name = Reference.NAME, version = Reference.VERSION)

@NetworkMod(clientSideRequired = true, serverSideRequired = false, channels={"MU_ModTeam_MU"}, packetHandler = MUPacketHandler.class)

public class MagicUnleashed {

    @Instance(Reference.MODDID)    

    public static MagicUnleashed instance;

    @SidedProxy(clientSide = "MU.proxy.ClientProxy", serverSide = "MU.proxy.CommonProxy")

    public static CommonProxy proxy;

    public static CreativeTabs tabMU = new MUCreativeTab(CreativeTabs.getNextID(), Reference.NAME);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {    

        instance = this;

        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();

        ItemRegistry.init(config);
        BlockRegistry.init(config);

        config.save();
    }

    @EventHandler
    public void mainInit(FMLInitializationEvent event) {

        proxy.register();
        GameRegistry.registerWorldGenerator(new WorldGenBlockTopazOre());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        CraftRegistry.init();
    }
}
