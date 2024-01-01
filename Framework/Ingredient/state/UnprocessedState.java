package Framework.Ingredient.state;

import Framework.Ingredient.Ingredient;

public class UnprocessedState implements State{
    @Override
    public boolean isProcessed(Ingredient ingredient) {
        return false;
    }
}
