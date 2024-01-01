package Framework.Boss;

import Framework.Container.Container;
import Framework.Ingredient.Ingredient;

public class SimpleBossVisitor implements BossVisitor {
    @Override
    public void visit(Container container) {
        System.out.println(container.getName() + "里存放着：");
        for (Ingredient ingredient : container.getIngredients()) {
            ingredient.displayInfo();
        }
        System.out.println();
    }
}