package Framework.Boss;

import Framework.Container.Container;
import Framework.Ingredient.Ingredient;

public class SimpleBossVistor {
    @Override
    public void visit(Container container) {
        System.out.println(container.getName() + "里存储着：");
        for (Ingredient ingredient : container.getIngredients()) {
            ingredient.displayInfo();
        }
        System.out.println();
    }
}
