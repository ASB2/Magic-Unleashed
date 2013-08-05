package MU.api.essence;

public enum EssenceType {

    AIR,
    EARTH,
    FIRE,
    WATER,
    OTHER,
    NONE,
    NON_UNDERSTANDABLE;

    public static int translateEssenceTypeToInt(EssenceType type) {

        switch(type) {

            case AIR: return 1;

            case EARTH:return 2;

            case FIRE:return 3;

            case WATER: return 4;

            case OTHER: return 5;

            case NONE: return 6;
            
            case NON_UNDERSTANDABLE: return 7;
        }
        return 0;        
    }

    public static EssenceType translateIntToEssenceType(int type) {

        switch(type) {

            case 1: return AIR;

            case 2:return EARTH;

            case 3:return FIRE;

            case 4: return WATER;

            case 5: return OTHER;

            case 6: return NONE;

            case 7: return NON_UNDERSTANDABLE;
        }
        
        return NONE;
    }
}
