package Framework.Commodity;

import Framework.Commodity.separate.SeparatePurchase;
import Framework.Commodity.combo.ComboPurchase;
import Framework.Commodity.separate.DiamondInlaidGoldNecklace;
import Framework.Commodity.separate.DiamondInlaidSilverNecklace;
import Framework.Ingredient.IngredientType;

import java.util.ArrayList;
import java.util.Arrays;

class RingFactory extends CommodityFactory {
	@Override
	public SeparatePurchase createSeparatePurchase(CommodityType commodityType) {
		return switch (commodityType) {
			case DIAMOND_INLAID_GOLD_RING -> new DiamondInlaidGoldRing(
					new ArrayList<>(Arrays.asList(
							IngredientType.GOLD,
							IngredientType.DIAMOND)),
					200.0
			);
			case DIAMOND_INLAID_SILVER_RING -> new DiamondInlaidSilverRing(
					new ArrayList<>(Arrays.asList(
							IngredientType.SILVER,
							IngredientType.DIAMOND)),
					130.0
			);
			default -> throw new IllegalArgumentException("No such ring in factory! ");
		};
	}

	@Override
	public ComboPurchase createComboPurchase(CommodityType commodityType) {
		return null;
	}
}
