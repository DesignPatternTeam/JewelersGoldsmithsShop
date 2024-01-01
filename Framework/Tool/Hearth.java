package Framework.Tool;

import Framework.Ingredient.Ingredient;
import Framework.Ingredient.IngredientType;
import Framework.Ingredient.state.StateType;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * hearth 炉子
 */
public class Hearth extends Tool {
    public Hearth() {
        this.availableTypes = new ArrayList<>(Arrays.asList(
                IngredientType.SILVER,
                IngredientType.GOLD));
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
        // 延时2秒钟
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ingredient.changeState(StateType.PROCESSED);
        System.out.println("你成功地使用" + this.getName() + "加工好了" + ingredient.getName());
    }
}