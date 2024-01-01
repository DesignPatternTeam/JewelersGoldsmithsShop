package Framework.Commodity.combo;

import Framework.Commodity.CommodityFactoryMaker;
import Framework.Commodity.CommodityType;
import Framework.Commodity.separate.SeparatePurchase;

import java.util.ArrayList;
import java.util.Arrays;

public class JadeNecklacesAndBracelets extends ComboPurchase {
    public JadeNecklacesAndBracelets() {
        super(new ArrayList<SeparatePurchase>(Arrays.asList(
                CommodityFactoryMaker.createFactory(CommodityFactoryMaker.CommodityFactoryType.NECKLACES).createPurchase(CommodityType.JADE_INLAID_GOLD_NECKLACE),
                CommodityFactoryMaker.createFactory(CommodityFactoryMaker.CommodityFactoryType.BRACELETS).createPurchase(CommodityType.JADE_BRACELET)
        )));
    }

    @Override
    public String getName() {
        return "尊贵翡翠金项链手镯组和";
    }
}
