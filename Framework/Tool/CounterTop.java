package Framework.Tool;

import Framework.Ingredient.Ingredient;
import Framework.Ingredient.IngredientType;
import Framework.Ingredient.state.IngredientStateType;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * CounterTop 操作台
 */
public class CounterTop extends Tool {
    public CounterTop() {
        this.availableTypes = new ArrayList<>(Arrays.asList(
                IngredientType.ROWNODDLE,
                IngredientType.PAKCHOI));
    }

    @Override
    public String getName() {
        return "操作台";
    }

    @Override
    void startProcessing(Ingredient ingredient) {
        System.out.println("开始使用操作台处理" + ingredient.getName() + "...");
    }

    @Override
    void finishProcessing(Ingredient ingredient) {
        ingredient.changeState(IngredientStateType.COOKED);
        System.out.println("你成功地使用" + this.getName() + "加工好了" + ingredient.getName());
    }
}
