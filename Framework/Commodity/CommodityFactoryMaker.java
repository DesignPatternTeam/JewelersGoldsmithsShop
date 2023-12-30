package Framework.Commodity;

public class CommodityFactoryMaker {
    public enum CommodityFactoryType {
        NECKLACES,
        BRACELETS,
        RINGS,
        COMBO,
        NULL
    }
    public static CommodityFactory createFactory(CommodityFactoryType commodityFactoryType) {
	    return switch (commodityFactoryType) {
		    case NECKLACES -> new NecklaceFactory();
		    case BRACELETS -> new BraceletFactory();
		    case RINGS -> new RingFactory();
		    case COMBO -> new ComboFactory();
		    default -> new NullCommodityFactory();
	    };
    }
}
