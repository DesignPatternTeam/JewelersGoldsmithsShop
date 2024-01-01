package Framework.Ingredient;

import java.util.ArrayList;

/**
 * Factory Pattern
 */
public class IngredientFactory {
    public Ingredient createIngredient(IngredientType ingredientType) {
        return switch (ingredientType) {
            case GOLD -> new Gold();
            case SILVER -> new Silver();
            case JADE -> new Jade();
            case DIAMOND -> new Diamond();
            default -> throw new IllegalArgumentException("no such ingredient");
        };
    }

    public ArrayList<Ingredient> createIngredientList(IngredientType ingredientType, Integer count) {
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            ingredients.add(this.createIngredient(ingredientType));
        }
        return ingredients;
    }
}
