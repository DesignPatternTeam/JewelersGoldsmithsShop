package Framework.Commodity;

import Framework.Commodity.combo.ComboPurchase;
import Framework.Commodity.separate.SeparatePurchase;
import Framework.Commodity.separate.GoldBracelet;
import Framework.Commodity.separate.JadeBracelet;
import Framework.Commodity.separate.SilverBracelet;

class BraceletFactory extends CommodityFactory {
	@Override
	public SeparatePurchase createSeparatePurchase(CommodityType commodityType) {
		return switch (commodityType) {
			case GOLD_BRACELET -> new GoldBracelet(60.0);
			case SILVER_BRACELET -> new SilverBracelet(10.0);
			case JADE_BRACELET -> new JadeBracelet(100.0);
			default -> throw new IllegalArgumentException("No such bracelet in factory! ");
		};
	}

	@Override
	public ComboPurchase createComboPurchase(CommodityType commodityType) {
		return null;
	}
}
