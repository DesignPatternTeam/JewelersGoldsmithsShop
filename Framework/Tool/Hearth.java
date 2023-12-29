package Framework.Tool;

import Framework.Ingredient.Ingredient;
import Framework.Ingredient.IngredientType;
import Framework.Ingredient.state.IngredientStateType;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * hearth 炉子
 */
public class Hearth extends Tool {
    public Hearth() {
        this.availableTypes = new ArrayList<>(Arrays.asList(
                IngredientType.PORKPATTY,
                IngredientType.SHRIMP));
    }

    @Override
    public String getName() {
        return "加工台";
    }

    @Override
    void startProcessing(Ingredient ingredient) {
        System.out.println("开始加工" + ingredient.getName() + "...");
    }

    @Override
    void finishProcessing(Ingredient ingredient) {
        ingredient.changeState(IngredientStateType.COOKED);
        System.out.println("你成功地使用" + this.getName() + "加工好了" + ingredient.getName());
    }
}