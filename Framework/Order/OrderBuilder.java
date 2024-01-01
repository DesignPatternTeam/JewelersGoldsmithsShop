package Framework.Order;


import Framework.Commodity.Commodity;
import Framework.Commodity.CommodityFactory;
import Framework.Commodity.CommodityFactoryMaker;
import Framework.Commodity.CommodityType;

import java.util.ArrayList;

public class OrderBuilder {
    private ArrayList<Commodity> commodities = new ArrayList<>();

    // 点项链
    public void orderNecklace(CommodityType type) {
        try {
            CommodityFactory factory = CommodityFactoryMaker.createFactory(CommodityFactoryMaker.CommodityFactoryType.NECKLACES);
            commodities.add(factory.createSeparatePurchase(type));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // 点戒指
    public void orderRing(CommodityType type) {
        try {
            CommodityFactory factory = CommodityFactoryMaker.createFactory(CommodityFactoryMaker.CommodityFactoryType.RINGS);
            commodities.add(factory.createSeparatePurchase(type));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // 点手镯
    public void orderBracelet(CommodityType type) {
        try {
            CommodityFactory factory = CommodityFactoryMaker.createFactory(CommodityFactoryMaker.CommodityFactoryType.BRACELETS);
            commodities.add(factory.createSeparatePurchase(type));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void orderSet(CommodityType type) {
        try {
            CommodityFactory factory = CommodityFactoryMaker.createFactory(CommodityFactoryMaker.CommodityFactoryType.COMBO);
            commodities.add(factory.createSeparatePurchase(type));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 下订单
     * @return 返回订单对象
     */
    public Order order() {
        Order order = new Order();

        for(Commodity commodity : commodities) {
            order.add(commodity);
        }

        return order;
    }

}
