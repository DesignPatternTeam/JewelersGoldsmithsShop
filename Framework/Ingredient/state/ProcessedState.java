package Framework.Ingredient.state;

import Framework.Ingredient.Ingredient;

public class ProcessedState implements State{
    @Override
    public boolean isProcessed(Ingredient ingredient) {
        return true;
    }
}
