package Framework.Ingredient.State;

import Framework.Ingredient.Ingredient;

public class IngredientFreshState implements IngredientState {
    @Override
    public boolean isWore(Ingredient ingredient) {
        return false;
    }

    @Override
    public boolean isProcessed(Ingredient ingredient) {
        return false;
    }
}
