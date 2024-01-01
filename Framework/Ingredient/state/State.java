package Framework.Ingredient.state;

import Framework.Ingredient.Ingredient;

public interface State {
    boolean isProcessed(Ingredient ingredient);
}
