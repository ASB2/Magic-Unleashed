package MU.api.essence;

public enum EssenceType {

    AIR(1),
    EARTH(2),
    FIRE(3),
    WATER(4),
    OTHER(5),
    NONE(6),
    NON_UNDERSTANDABLE(7);

    EssenceType(int id) {

        essenceID = id;
    }

    int essenceID = 0;

    public static int translateEssenceTypeToInt(EssenceType type) {

        return type.essenceID;        
    }

    public static EssenceType translateIntToEssenceType(int type) {

        for(EssenceType tempType : EssenceType.values()) {

            if(tempType.essenceID == type) {

                return tempType;
            }
        }
        return NONE;
    }
}
