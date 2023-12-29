package Framework.Tool;

import Framework.Ingredient.Ingredient;
import Framework.Ingredient.IngredientType;

import java.util.ArrayList;


public abstract class Tool {

    protected ArrayList<IngredientType> availableTypes = new ArrayList<IngredientType>();

    private boolean isIngredientTypeLegal(IngredientType type) {
        return availableTypes.contains(type);
    }

    /**
     * 获取到原材料后，使用工具进行加工
     * @param ingredient 原材料
     */
    public final void process(Ingredient ingredient) {
        if (!(this.isIngredientTypeLegal(ingredient.getIngredientType()))) {
            throw new IllegalArgumentException("this ingredient doesn't belong here");
        }
        startProcessing(ingredient);
        finishProcessing(ingredient);
    }

    abstract void startProcessing(Ingredient ingredient);

    abstract void finishProcessing(Ingredient ingredient);

    public abstract String getName();
}