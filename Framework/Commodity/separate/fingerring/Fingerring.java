package Framework.Commodity.separate.fingerring;

import Framework.Boss.Boss;
import Framework.Commodity.separate.SeparatePurchase;
import Framework.Ingredient.IngredientType;

import java.util.List;

public abstract class Fingerring extends SeparatePurchase {
    private final List<IngredientType> requirements;
    public Fingerring(List<IngredientType> requirements,double price) {
        super(price);
        this.requirements = requirements;
    }
    @Override
    public void process(){
        System.out.println("\n开始加工" + this.getName());
        Boss boss = Boss.getInstance();
        for (IngredientType type : requirements) {
            if (!(boss.hasIngredient(type))) {
                System.out.println("缺少材料，加工失败：(");
                return;
            }
        }
        for (IngredientType type : requirements) {
            boss.getIngredient(type).doProcess();
        }
        System.out.println(this.getName()+"加工完成！");
    }
}
