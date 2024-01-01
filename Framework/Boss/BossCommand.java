package Framework.Boss;

import Framework.Order.Order;

public interface BossCommand {
    void showStock();/*查看库存*/
    void processOrder(Order order);/*处理订单*/
}
