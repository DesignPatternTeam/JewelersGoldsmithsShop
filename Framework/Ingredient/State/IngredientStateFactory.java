package Framework.Ingredient.State;

import java.util.HashMap;

/**
 * Flyweight
 */
public class IngredientStateFactory {
    private static HashMap<IngredientStateType, IngredientState> map = new HashMap<>();

    public static IngredientState getState(IngredientStateType type) {
        IngredientState state = map.get(type);
        if (state == null) {
            switch (type) {
                case FRESH:
                    state = new IngredientFreshState();
                    map.put(type, state);
                    break;
                case WORE:
                    state = new IngredientWoreState();
                    map.put(type, state);
                    break;
                case PROCESSED:
                    state = new IngredientProcessedState();
                    map.put(type, state);
                    break;
            }
        }
        return state;
    }
}
