package Framework.Commodity.combo;

import Framework.Commodity.CommodityFactoryMaker;
import Framework.Commodity.CommodityType;
import Framework.Commodity.separate.SeparatePurchase;

import java.util.ArrayList;
import java.util.Arrays;

public class SilverRingsAndBracelets extends ComboPurchase {
    public SilverRingsAndBracelets() {
        super(new ArrayList<SeparatePurchase>(Arrays.asList(
                CommodityFactoryMaker.createFactory(CommodityFactoryMaker.CommodityFactoryType.RINGS).createPurchase(CommodityType.DIAMOND_INLAID_SILVER_RING),
                CommodityFactoryMaker.createFactory(CommodityFactoryMaker.CommodityFactoryType.BRACELETS).createPurchase(CommodityType.SILVER_BRACELET)
        )));
    }

    @Override
    public String getName() {
        return "高雅镶钻银戒指手镯组和";
    }

    @Override
    public void process() {

    }
}
