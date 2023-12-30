package Framework.Ingredient.State;

import Framework.Ingredient.Ingredient;

/**
 * DP: State
 */
public interface IngredientState {
    public abstract boolean isWore(Ingredient ingredient);

    public abstract boolean isProcessed(Ingredient ingredient);
}
