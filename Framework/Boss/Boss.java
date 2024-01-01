package Framework.Boss;
import Framework.Container.Vault;
import Framework.Container.Displayer;
import Framework.Container.TrayDecorator;
import Framework.Ingredient.Ingredient;
import Framework.Ingredient.IngredientType;
import Framework.Order.Order;
public final class Boss {
    private Boss() {
        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("Already initialized.");
        }

        System.out.println("Boss, start to work\n");
    }
    private static Chef instance;
    private BossVistorVisitor visitor = new SimpleBossVisitor();
    public static synchronized Boss getInstance() {
        if (instance == null) {
            instance = new Boss();
        }
        return instance;
    }

    @Override
    public void showStock() {
        System.out.println("查看库存中...");
        Displayer displayer = Displayer.getInstance();/* 存储室 */
        Vault vault = Vault.getInstance(); /*保险柜*/
        System.out.println("这就是金店里所有的容器了！\n");
        displayer.accept(visitor);
        vault.accept(visitor);
    }
    /**
     * 原料
     * 金、银玉石、钻石
     * Gold, silver, jade, diamond
     */
    public boolean hasIngredient(IngredientType type) {
        if (type == IngredientType.GOLD || type == IngredientType.SILVER) {
            return Displayer.getInstance().has(type);
        } else {
            return Vault.getInstance().has(type);
        }
    }

    public Ingredient getIngredient(IngredientType type) {
        if (type == IngredientType.GOLD || type == IngredientType.SILVER) {
            return Displayer.getInstance().fetch(type);
        } else {
            return Vault.getInstance().fetch(type);
        }
    }
    /**
     * 对外只提供处理订单接口，内部实现处理的逻辑是进货or 回收、加工、整合
     * 取食材、加工、整合。。。
     * @param order
     */
    @Override
    public void processOrder(Order order) {
        System.out.println("Boss，new order！");
        order.displayMerches();
        order.handle();
        TrayDecorator decorator = new TrayDecorator(order);
        decorator.displayMerches();
        System.out.println("\n订单完成！");
    }

}
