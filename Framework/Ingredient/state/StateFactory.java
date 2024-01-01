package Framework.Ingredient.state;

import Framework.Ingredient.Ingredient;

import java.util.HashMap;

/*
* FlyweightFactory, 享元模式，至于是不是享元工厂，我也不知道
* */
public class StateFactory {
    private static final HashMap<StateType,State> stateMap = new HashMap<>();

    public static State getState(StateType type) {
        State state = stateMap.get(type);
        if (state == null) {
            switch (type) {
                case UNPROCESSED:
                    state = new UnprocessedState();
                    stateMap.put(type, state);
                    break;
                case PROCESSED:
                    state = new ProcessedState();
                    stateMap.put(type, state);
                    break;
            }
        }
        return state;
    }
}
