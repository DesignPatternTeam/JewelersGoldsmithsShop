package Framework.Commodity;

import Framework.Commodity.separate.SeparatePurchase;
import Framework.Commodity.separate.NullSeparatePurchase;
import Framework.Commodity.combo.ComboPurchase;
import Framework.Commodity.combo.NullComboPurchase;

public class NullCommodityFactory extends CommodityFactory {
	@Override
	public SeparatePurchase createSeparatePurchase(CommodityType commodityType) {
		return new NullSeparatePurchase();
	}

	@Override
	public ComboPurchase createComboPurchase(CommodityType commodityType) {
		return new NullComboPurchase();
	}
}
