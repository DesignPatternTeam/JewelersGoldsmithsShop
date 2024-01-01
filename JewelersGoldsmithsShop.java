import Framework.Boss.Boss;
import Framework.Boss.SimpleBossVisitor;
import Framework.Commodity.Commodity;
import Framework.Commodity.CommodityFactory;
import Framework.Commodity.CommodityFactoryMaker;
import Framework.Commodity.CommodityType;
import Framework.Commodity.combo.ComboPurchase;
import Framework.Container.ContainerIterator;
import Framework.Container.Displayer;
import Framework.Container.TrayDecorator;
import Framework.Container.Vault;
import Framework.Ingredient.Ingredient;
import Framework.Ingredient.IngredientFactory;
import Framework.Ingredient.IngredientType;
import Framework.Ingredient.state.StateFactory;
import Framework.Ingredient.state.StateType;
import Framework.Order.Order;
import Framework.Order.OrderBuilder;
import Framework.Tool.CounterTop;
import Framework.Tool.Hearth;

public class JewelersGoldsmithsShop {
	public static void main(String[] args) {
		TestOrderProcess();
		TestSingletonPattern();
		TestFactoryPattern();
		TestAbstractFactoryPattern();
		TestTemplatePattern();
		TestStatePattern();
		TestDecoratorPattern();
		TestStrategyPattern();
		TestBuilderPattern();
		TestBridgePattern();
		TestFacadePattern();
		TestFlyweightPattern();
		TestPrototypePattern();
		TestNullObjectPattern();
		TestCompositePattern();
		TestVisitorPattern();
		TestIteratorPattern();
	}

	public static void TestOrderProcess() {
		// 点单测试
		Boss boss = Boss.getInstance();

		boss.showStock();

		OrderBuilder builder = new OrderBuilder();
		builder.orderNecklace(CommodityType.DIAMOND_INLAID_GOLD_NECKLACE);

		builder.orderSet(CommodityType.JADE_INLAID_GOLD_NECKLACE_AND_JADE_BRACELET);
		builder.orderRing(CommodityType.DIAMOND_INLAID_SILVER_RING);
		Order order = builder.order();

		boss.processOrder(order);
	}

	public static void TestSingletonPattern() {
		System.out.println("*******************");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.printf("比较老板实例地址是否相等: %b\n", Boss.getInstance() == Boss.getInstance());
		System.out.printf("比较展柜实例地址是否相等: %b\n", Displayer.getInstance() == Displayer.getInstance());
		System.out.printf("比较保险柜实例地址是否相等: %b\n", Vault.getInstance() == Vault.getInstance());
		System.out.println("*******************");
	}

	public static void TestFactoryPattern() {
		System.out.println("*******************");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		IngredientFactory factory = new IngredientFactory();
		System.out.printf("创建原料工厂: %s\n", factory.getClass().getCanonicalName());
		System.out.printf("创建原料: %s\n", factory.createIngredient(IngredientType.DIAMOND).getName());
		System.out.println("*******************");
	}

	public static void TestAbstractFactoryPattern() {
		System.out.println("*******************");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		CommodityFactory factory1 = CommodityFactoryMaker.createFactory(CommodityFactoryMaker.CommodityFactoryType.COMBO);
		CommodityFactory factory2 = CommodityFactoryMaker.createFactory(CommodityFactoryMaker.CommodityFactoryType.RINGS);
		System.out.printf("使用抽象工厂创建一个原料工厂: %s; 再使用该工厂创建商品: %s\n", factory1.getClass().getCanonicalName(), factory1.createComboPurchase(CommodityType.DIAMOND_INLAID_GOLD_NECKLACE_AND_DIAMOND_INLAID_GOLD_RING).getName());
		System.out.printf("使用抽象工厂创建一个原料工厂: %s\n", factory2.getClass().getCanonicalName());
		System.out.println("*******************");
	}

	public static void TestTemplatePattern() {
		System.out.println("*******************");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		Ingredient gold = new IngredientFactory().createIngredient(IngredientType.GOLD);
		Ingredient diamond = new IngredientFactory().createIngredient(IngredientType.DIAMOND);
		new Hearth().process(gold);
		new CounterTop().process(diamond);
		System.out.println("*******************");
	}

	public static void TestStatePattern() {
		System.out.println("*******************");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		Ingredient diamond = new IngredientFactory().createIngredient(IngredientType.DIAMOND);
		System.out.println("> 初始状态");
		System.out.printf("钻石是否加工： %b\n", diamond.isProcessed());
		System.out.println("> 状态->加工");
		diamond.changeState(StateType.PROCESSED);
		System.out.printf("钻石是否加工： %b\n", diamond.isProcessed());
		System.out.println("*******************");
	}

	public static void TestDecoratorPattern() {
		System.out.println("*******************");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		OrderBuilder builder = new OrderBuilder();
		builder.orderNecklace(CommodityType.DIAMOND_INLAID_GOLD_NECKLACE);
		Order order = builder.order();

		order.displayCommodities();

		TrayDecorator decorator = new TrayDecorator(order);
		System.out.println("> 经过 TrayDecorator 后");
		decorator.displayCommodities();
		System.out.println("*******************");
	}

	public static void TestStrategyPattern() {
		System.out.println("*******************");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		Ingredient gold = new IngredientFactory().createIngredient(IngredientType.GOLD);
		System.out.println("> 设置金的加工工具为 熔炉");
		gold.setTool(new Hearth());
		gold.doProcess();
		System.out.println("*******************");
	}

	public static void TestBuilderPattern() {
		System.out.println("*******************");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		OrderBuilder builder = new OrderBuilder();
		builder.orderNecklace(CommodityType.DIAMOND_INLAID_GOLD_NECKLACE);
		builder.orderSet(CommodityType.DIAMOND_INLAID_GOLD_NECKLACE_AND_DIAMOND_INLAID_GOLD_RING);
		builder.orderSet(CommodityType.JADE_INLAID_GOLD_NECKLACE_AND_JADE_BRACELET);
		builder.orderBracelet(CommodityType.SILVER_BRACELET);
		Order order = builder.order();

		order.displayCommodities();
		System.out.println("*******************");
	}

	public static void TestBridgePattern() {
		System.out.println("*******************");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		OrderBuilder builder = new OrderBuilder();
		builder.orderRing(CommodityType.DIAMOND_INLAID_GOLD_RING);
		builder.orderSet(CommodityType.JADE_INLAID_GOLD_NECKLACE_AND_JADE_BRACELET);
		builder.orderBracelet(CommodityType.JADE_BRACELET);
		Order order = builder.order();
		System.out.printf("订单价格，通过内部商品计算 %f\n", order.totalPrice());
		System.out.println("*******************");
	}

	public static void TestFacadePattern() {
		System.out.println("*******************");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println("> 老板的操作对外简化成几个简单的接口，内部操作对外隐藏");
		Boss chef = Boss.getInstance();

		chef.showStock();
		System.out.println("*******************");
	}

	public static void TestFlyweightPattern() {
		System.out.println("*******************");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println("> 原料加工状态对象全局共享");
		System.out.printf("processed: %b\n", StateFactory.getState(StateType.PROCESSED) == StateFactory.getState(StateType.PROCESSED));
		System.out.println("*******************");
	}

	public static void TestPrototypePattern() {
		System.out.println("*******************");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		Ingredient diamond1 = new IngredientFactory().createIngredient(IngredientType.DIAMOND);
		try {
			Ingredient diamond2 = (Ingredient) diamond1.clone();
			System.out.printf("diamond1==diamond2: %b\n", diamond1 == diamond2);
			System.out.println("> diamond1 info");
			diamond1.displayInfo();
			System.out.println("> diamond2 info");
			diamond2.displayInfo();
		}
		catch (CloneNotSupportedException e) {
			System.out.println("Clone is not supported on this ingredient");
		}
		System.out.println("*******************");
	}

	public static void TestNullObjectPattern() {
		System.out.println("*******************");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println("> 尝试创建一个不存在的工厂");
		CommodityFactory factory = CommodityFactoryMaker.createFactory(CommodityFactoryMaker.CommodityFactoryType.NULL);
		Commodity commodity = factory.createComboPurchase(CommodityType.DIAMOND_INLAID_GOLD_NECKLACE_AND_DIAMOND_INLAID_GOLD_RING);
		System.out.printf("对象: %s, 价格: %f\n", commodity.getClass().getCanonicalName(), commodity.getPrice());
		System.out.println("*******************");
	}

	public static void TestCompositePattern() {
		System.out.println("*******************");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		CommodityFactory factory = CommodityFactoryMaker.createFactory(CommodityFactoryMaker.CommodityFactoryType.COMBO);
		ComboPurchase combo = factory.createComboPurchase(CommodityType.DIAMOND_INLAID_SILVER_RING_AND_JADE_BRACELET);
		System.out.printf("组合名：%s, 组合价格：%s\n", combo.getName(), combo.getPrice());
		System.out.println("*******************");
	}

	public static void TestVisitorPattern() {
		System.out.println("*******************");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		Displayer.getInstance().accept(new SimpleBossVisitor());
		System.out.println("*******************");
	}

	public static void TestIteratorPattern() {
		System.out.println("*******************");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		Vault vault = Vault.getInstance();
		System.out.println("保险箱里有：");

		for (ContainerIterator iterator = vault.Iterator(); iterator.hasNext(); ) {
			Ingredient ingredient = iterator.next();
			System.out.printf("* %s\n", ingredient.getName());
		}
		System.out.println("*******************");
	}
}
