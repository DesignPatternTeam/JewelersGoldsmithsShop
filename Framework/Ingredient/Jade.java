package Framework.Ingredient;

import Framework.Tool.Hearth;

public class Jade extends Ingredient {
    Jade() {
        this.setCooker(new Hearth());
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
