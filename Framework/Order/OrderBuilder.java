package Framework.Order;


import Framework.Commodity.Commodity;

import java.util.ArrayList;

public class OrderBuilder {
    private ArrayList<Commodity> commodities = new ArrayList<>();

    // 点项链
    public void orderNecklace(CommodityType type) {
        try {
            CommodityFactory factory = CommodityFactory.craete(CommodityFactoryMaker.CommodityFactoryType.NECKLACE);
            commodities.add(factory.createSingleOrder(type));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // 点戒指
    public void orderRing(CommodityType type) {
        try {
            CommodityFactory factory = CommodityFactory.craete(CommodityFactoryMaker.CommodityFactoryType.RING);
            commodities.add(factory.createSingleOrder(type));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // 点手镯
    public void orderBracelet(CommodityType type) {
        try {
            CommodityFactory factory = CommodityFactory.craete(CommodityFactoryMaker.CommodityFactoryType.BRACELET);
            commodities.add(factory.createSingleOrder(type));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void orderSet(CommodityType type) {
        try {
            CommodityFactory factory = CommodityFactory.craete(CommodityFactoryMaker.CommodityFactoryType.SET);
            commodities.add(factory.createSingleOrder(type));
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
