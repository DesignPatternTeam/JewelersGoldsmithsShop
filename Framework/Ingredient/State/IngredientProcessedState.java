package Framework.Ingredient.State;

import Framework.Ingredient.Ingredient;

public class IngredientProcessedState implements IngredientState {
    @Override
    public boolean isProcessed(Ingredient ingredient) {
        return true;
    }

    @Override
    public boolean isWore(Ingredient ingredient) {
        return false;
    }
}