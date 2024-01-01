package Framework.Commodity;

import Framework.Commodity.combo.ComboPurchase;
import Framework.Commodity.separate.Bracelet.GoldBracelet;
import Framework.Commodity.separate.Bracelet.JadeBracelet;
import Framework.Commodity.separate.Bracelet.SilverBracelet;
import Framework.Commodity.separate.SeparatePurchase;
import Framework.Ingredient.IngredientType;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BraceletFactory extends CommodityFactory {
	@Override
	public SeparatePurchase createSeparatePurchase(CommodityType commodityType) {
		return switch (commodityType) {
			case GOLD_BRACELET -> new GoldBracelet(new ArrayList<>(List.of(IngredientType.GOLD)),60.0);
			case SILVER_BRACELET -> new SilverBracelet(new ArrayList<>(List.of(IngredientType.SILVER)),10.0);
			case JADE_BRACELET -> new JadeBracelet(new ArrayList<>(List.of(IngredientType.JADE)),100.0);
			default -> throw new IllegalArgumentException("No such bracelet in factory! ");
		};
	}

	@Override
	public ComboPurchase createComboPurchase(CommodityType commodityType) {
		return null;
	}
}
