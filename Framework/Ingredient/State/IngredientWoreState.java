package Framework.Ingredient.State;

import Framework.Ingredient.Ingredient;

public class IngredientWoreState implements IngredientState {
    @Override
    public boolean isWore(Ingredient ingredient) {
        return true;
    }

    @Override
    public boolean isProcessed(Ingredient ingredient) {
        return false;
    }
}
