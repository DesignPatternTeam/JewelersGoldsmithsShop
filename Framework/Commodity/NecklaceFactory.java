package Framework.Commodity;

import Framework.Ingredient.IngredientType;
import Framework.Commodity.separate.SeparatePurchase;
import Framework.Commodity.combo.ComboPurchase;
import Framework.Commodity.separate.DiamondInlaidGoldNecklace;
import Framework.Commodity.separate.JadeInlaidGoldNecklace;

import java.util.ArrayList;
import java.util.Arrays;

class NecklaceFactory extends CommodityFactory {
	@Override
	public SeparatePurchase createSeparatePurchase(CommodityType commodityType) {
		return switch (commodityType) {
			case DIAMOND_INLAID_GOLD_NECKLACE -> new DiamondInlaidGoldNecklace(
					new ArrayList<>(Arrays.asList(
							IngredientType.GOLD,
							IngredientType.DIAMOND)),
					100.0
			);
			case JADE_INLAID_GOLD_NECKLACE -> new JadeInlaidGoldNecklace(
					new ArrayList<>(Arrays.asList(
							IngredientType.GOLD,
							IngredientType.JADE)),
					230.0
			);
			default -> throw new IllegalArgumentException("No such necklace in factory! ");
		};
	}

	@Override
	public ComboPurchase createComboPurchase(CommodityType commodityType) {
		return null;
	}
}
