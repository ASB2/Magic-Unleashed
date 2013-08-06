package MU.api.essence;

import java.util.EnumSet;

import net.minecraft.block.Block;

public class EssenceManager {

    public static EssenceManager instance = new EssenceManager();

    public EnumSet<EssenceType> getVinillaEssenceValue(Block block) {

        if(block == Block.stone) return EnumSet.of(EssenceType.EARTH);
        if(block == Block.grass) return EnumSet.of(EssenceType.EARTH);
        if(block == Block.dirt) return EnumSet.of(EssenceType.EARTH);
        if(block == Block.cobblestone) return EnumSet.of(EssenceType.EARTH);
        if(block == Block.planks) return EnumSet.of(EssenceType.EARTH);
        if(block == Block.sapling) return EnumSet.of(EssenceType.EARTH);
        if(block == Block.sand) return EnumSet.of(EssenceType.EARTH, EssenceType.AIR);
        if(block == Block.gravel) return EnumSet.of(EssenceType.EARTH, EssenceType.AIR);
        if(block == Block.oreGold) return EnumSet.of(EssenceType.EARTH);
        if(block == Block.oreIron) return EnumSet.of(EssenceType.EARTH);
        if(block == Block.oreCoal) return EnumSet.of(EssenceType.EARTH, EssenceType.FIRE);
        if(block == Block.wood) return EnumSet.of(EssenceType.EARTH);
        if(block == Block.leaves) return EnumSet.of(EssenceType.EARTH);
        if(block == Block.sponge) return EnumSet.of(EssenceType.WATER);
        if(block == Block.glass) return EnumSet.of(EssenceType.EARTH, EssenceType.FIRE);
        if(block == Block.oreLapis) return EnumSet.of(EssenceType.EARTH);
        if(block == Block.blockLapis) return EnumSet.of(EssenceType.EARTH);
        if(block == Block.dispenser) return EnumSet.of(EssenceType.EARTH);
        if(block == Block.sandStone) return EnumSet.of(EssenceType.EARTH, EssenceType.AIR);
        
        if(block == Block.web) return EnumSet.of(EssenceType.AIR);
        if(block == Block.tallGrass) return EnumSet.of(EssenceType.EARTH, EssenceType.AIR);
        if(block == Block.deadBush) return EnumSet.of(EssenceType.EARTH, EssenceType.AIR);
        if(block == Block.plantYellow) return EnumSet.of(EssenceType.EARTH, EssenceType.AIR);
        if(block == Block.mushroomBrown) return EnumSet.of(EssenceType.EARTH, EssenceType.AIR);
        if(block == Block.mushroomRed) return EnumSet.of(EssenceType.EARTH, EssenceType.AIR);
        
        return EnumSet.of(EssenceType.NONE);
    }

    public static EssenceManager getInstance() {

        return instance;
    }
}
