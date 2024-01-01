package Framework.Commodity;

import Framework.Commodity.separate.SeparatePurchase;
import Framework.Commodity.combo.ComboPurchase;

public abstract class CommodityFactory {
    public abstract SeparatePurchase createSeparatePurchase(CommodityType commodityType);

    public abstract ComboPurchase createComboPurchase(CommodityType commodityType);
}
