package Framework.Container;

import Framework.Order.Order;
import Framework.Order.OrderInterface;

public class TrayDecorator implements OrderInterface {
    private Order order;

    public TrayDecorator(Order order) {
        this.order = order;
    }

    @Override
    public double totalPrice() {
        return order.totalPrice();
    }

    @Override
    public boolean hasTray() {
        return true;
    }

    @Override
    public void displayMerches() {
        System.out.println("本次订单已包装");
        order.displayMerches();
    }
}
