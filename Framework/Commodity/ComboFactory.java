package Framework.Commodity;

import Framework.Commodity.separate.SeparatePurchase;
import Framework.Commodity.combo.*;

public class ComboFactory extends CommodityFactory {
	@Override
	public SeparatePurchase createSeparatePurchase(CommodityType commodityType) {
		return null;
	}

	@Override
	public ComboPurchase createComboPurchase(CommodityType commodityType) {
		return switch (commodityType) {
			case DIAMOND_INLAID_GOLD_NECKLACE_AND_DIAMOND_INLAID_GOLD_RING ->
					new DiamondInlaidGoldNecklacesAndRings();
			case JADE_INLAID_GOLD_NECKLACE_AND_JADE_BRACELET ->
					new JadeNecklacesAndBracelets();
			case DIAMOND_INLAID_SILVER_RING_AND_JADE_BRACELET ->
					new SilverRingsAndBracelets();

//			case DIAMOND_INLAID_GOLD_NECKLACE_AND_DIAMOND_INLAID_SILVER_RING ->
//					new DiamondInlaidGoldNecklaceAndDiamondInlaidSilverRing();
//			case DIAMOND_INLAID_GOLD_NECKLACE_AND_GOLD_BRACELET -> new DiamondInlaidGoldNecklaceAndGoldBracelet();
//			case DIAMOND_INLAID_GOLD_NECKLACE_AND_SILVER_BRACELET -> new DiamondInlaidGoldNecklaceAndSilverBracelet();
//			case DIAMOND_INLAID_GOLD_NECKLACE_AND_JADE_BRACELET -> new DiamondInlaidGoldNecklaceAndJadeBracelet();
//			case JADE_INLAID_GOLD_NECKLACE_AND_DIAMOND_INLAID_GOLD_RING ->
//					new JadeInlaidGoldNecklaceAndDiamondInlaidGoldRing();
//			case JADE_INLAID_GOLD_NECKLACE_AND_DIAMOND_INLAID_SILVER_RING ->
//					new JadeInlaidGoldNecklaceAndDiamondInlaidSilverRing();
//			case JADE_INLAID_GOLD_NECKLACE_AND_GOLD_BRACELET -> new JadeInlaidGoldNecklaceAndGoldBracelet();
//			case JADE_INLAID_GOLD_NECKLACE_AND_SILVER_BRACELET -> new JadeInlaidGoldNecklaceAndSilverBracelet();
//			case JADE_INLAID_GOLD_NECKLACE_AND_JADE_BRACELET -> new JadeInlaidGoldNecklaceAndJadeBracelet();
			default -> throw new IllegalArgumentException("No such combo in factory!");
		};
	}
}