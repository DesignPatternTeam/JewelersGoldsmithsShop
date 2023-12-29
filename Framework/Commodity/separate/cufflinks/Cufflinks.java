package Framework.Commodity.separate.cufflinks;

import Framework.Boss.Boss;
import Framework.Commodity.separate.SeparatePurchase;
import Framework.Ingredient.Ingredient;
import Framework.Ingredient.IngredientType;

import java.util.List;

public abstract class Cufflinks extends SeparatePurchase {
    private List<IngredientType> ingredients=null;
    public Cufflinks(double price) {
        super(price);
    }
    Cufflinks(List<IngredientType> ingredients, double price) {
        super(price);
        this.ingredients=ingredients;
    }
    public List<IngredientType> getIngredients() {
        return ingredients;
    }
    @Override
    public void process() {
        System.out.println("\n开始加工" + this.getName());
        Boss chef = Boss.getInstance();

        for (IngredientType type : ingredients) {
            if (!(chef.hasIngredient(type))) {
                System.out.println("缺少材料，加工失败：(");
                return;
            }
        }

        for (IngredientType type : ingredients) {
            Ingredient ingredient = chef.getIngredient(type);
            ingredient.doCook();
        }

        System.out.println("哇哇哇！你成功地做好了" + this.getName());
    }

}
