package Framework.Commodity.combo;

import Framework.Commodity.separate.SeparatePurchase;
import Framework.Commodity.CommodityFactoryMaker;
import Framework.Commodity.CommodityType;

import java.util.ArrayList;
import java.util.Arrays;

public class DiamondInlaidGoldNecklacesAndRings extends ComboPurchase {
    public DiamondInlaidGoldNecklacesAndRings() {
        super(new ArrayList<SeparatePurchase>(Arrays.asList(
                CommodityFactoryMaker.createFactory(CommodityFactoryMaker.CommodityFactoryType.NECKLACES).createPurchase(CommodityType.DIAMOND_INLAID_GOLD_NECKLACE),
                CommodityFactoryMaker.createFactory(CommodityFactoryMaker.CommodityFactoryType.RINGS).createPurchase(CommodityType.DIAMOND_INLAID_GOLD_RING)
        )));
    }

    @Override
    public String getName() {
        return "奢华镶钻金项链戒指组和";
    }
}
