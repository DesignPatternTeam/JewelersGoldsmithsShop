package Framework.Boss;
import Framwork.Order.Order;
public interface BossCommand {
    void showStock();/*查看库存*/
    void processOrder(Order order);/*处理订单*/
}
