package Framework.Boss;

import Framework.Order.Order;

public interface BossCommand {
    void processOrder(Order order);

}
