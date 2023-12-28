package framework.ingredient;

import framework.cooker.Hearth;

public class Jade extends Ingredient {
    Jade(double baseStateUpdateRate) {
        super(baseStateUpdateRate);
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
