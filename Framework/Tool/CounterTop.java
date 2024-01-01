package Framework.Tool;

import Framework.Ingredient.Ingredient;
import Framework.Ingredient.IngredientType;
import Framework.Ingredient.state.StateType;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * CounterTop 操作台
 */
public class CounterTop extends Tool {
    public CounterTop() {
        this.availableTypes = new ArrayList<>(Arrays.asList(
                IngredientType.JADE,
                IngredientType.DIAMOND));
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
        // 延时2秒钟
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ingredient.changeState(StateType.PROCESSED);
        System.out.println("你成功地使用" + this.getName() + "加工好了" + ingredient.getName());
    }
}
