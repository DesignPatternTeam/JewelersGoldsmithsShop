package Framework.Ingredient;

import Framework.Tool.CounterTop;

public class Jade extends Ingredient {
    Jade() {
        this.setTool(new CounterTop());
    }

    @Override
    public IngredientType getIngredientType() {
        return IngredientType.JADE;
    }

    @Override
    public String getName() {
        return "玉石";
    }
}
