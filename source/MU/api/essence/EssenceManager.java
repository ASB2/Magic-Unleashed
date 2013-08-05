package MU.api.essence;

import java.util.EnumSet;

import net.minecraft.block.Block;

public class EssenceManager {

    public static EssenceManager instance = new EssenceManager();

    public EnumSet<EssenceType> getVinillaEssenceValue(Block block) {

        if(block == Block.stone) {

            return EnumSet.of(EssenceType.EARTH);
        }
        return EnumSet.of(EssenceType.NONE);
    }

    public static EssenceManager getInstance() {

        return instance;
    }
}
