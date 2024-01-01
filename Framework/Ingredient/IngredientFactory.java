package Framework.Ingredient;

import java.util.ArrayList;

/**
 * Factory Pattern
 */
public class IngredientFactory {
    public Ingredient createIngredient(IngredientType ingredientType) {
        switch (ingredientType) {
            case GOLD:
                return new Gold(0.2);
            case SILVER:
                return new Silver(0.8);
            case JADE:
                return new Jade(1.1);
            case DIAMOND:
                return new Diamond(0.5);
            default:
                throw new IllegalArgumentException("no such ingredient");
        }
    }

    public ArrayList<Ingredient> createIngredientList(IngredientType ingredientType, Integer count) {
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        for (Integer i = 0; i < count; i++) {
            ingredients.add(this.createIngredient(ingredientType));
        }
        return ingredients;
    }
}
