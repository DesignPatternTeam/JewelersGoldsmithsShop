import Framework.Commodity.CommodityFactory;
import Framework.Commodity.CommodityFactoryMaker;
import Framework.Container.Displayer;
import Framework.Container.Vault;
import Framework.Ingredient.Ingredient;
import Framework.Ingredient.IngredientFactory;
import Framework.Ingredient.IngredientType;
import Framework.Boss.Boss;
import Framework.Ingredient.state.StateType;
import Framework.Order.OrderBuilder;
import Framework.Tool.CounterTop;
import Framework.Tool.Hearth;

public class JewelersGoldsmithsShop {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		TestSingletonPattern();
		TestFactoryPattern();
		TestAbstractFactoryPattern();
		TestTemplatePattern();
		TestObserverPattern();
		TestStatePattern();
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
		System.out.printf("使用抽象工厂创建一个原料工厂: %s; 再使用该工厂创建商品: %s\n", factory1.getClass().getCanonicalName(), factory1.createSet(MerchType.SET_PORK_NOODLES_COKE).getName());
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

	public static void TestObserverPattern() {
		System.out.println("*******************");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		Ingredient diamond = new IngredientFactory().createIngredient(IngredientType.DIAMOND);
		diamond.displayInfo();
//		Timer.getInstance().tick(); ???
		diamond.displayInfo();
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
//		System.out.println("> 状态->腐烂");
//		diamond.changeState(IngredientStateType.STALE);
//		System.out.printf("猪排是否加工： %b；腐烂: %b\n", diamond.isCooked(), diamond.isStale());
		System.out.println("*******************");
	}

//	public static void TestDecoratorPattern() {
//		System.out.println("*******************");
//		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
//		OrderBuilder builder = new OrderBuilder();
//		builder.orderBeverage(MerchType.COKE);
//		Order order = builder.order();
//
//		order.displayMerches();
//
//		TrayDecorator decorator = new TrayDecorator(order);
//		System.out.println("> 经过 TrayDecorator 后");
//		decorator.displayMerches();
//		System.out.println("*******************");
//	}
}

