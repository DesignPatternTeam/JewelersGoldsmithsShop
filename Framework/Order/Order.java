package Framework.Order;

import Framework.Commodity.Commodity;

import java.util.ArrayList;

public class Order implements OrderInterface {
    private ArrayList<Commodity> commodities = new ArrayList<>();

    public void add(Commodity commodity) {
        commodities.add(commodity);
    }

    @Override
    public double totalPrice() {
        double price = 0;
        for(Commodity commodity : commodities) {
            price += commodity.getPrice();
        }
        return price;
    }

    public void displayCommodities() {
        System.out.print("订单的内容包括：");
        for(Commodity commodity : commodities) {
            System.out.print(commodity.getName() + " ");
        }
        System.out.println();
        System.out.println("订单价格为：" + totalPrice());
    }

    public void handle() {
        for(Commodity commodity : commodities) {
            System.out.println();
            commodity.process();
        }
        System.out.println();
    }

    public ArrayList<Commodity> getCommodities() {
        return commodities;
    }

    @Override
    public boolean hasGiftBox() {
        return false;
    }
}
