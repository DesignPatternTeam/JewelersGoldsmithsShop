package Framework.Ingredient;

import Framework.Tool.OperatorTop;

public class Jade extends Ingredient {
    Jade() {
        this.setTool(new OperatorTop());
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
