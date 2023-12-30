package framework.ingredient;

import framework.cooker.Hearth;

public class Diamond extends Ingredient {
    Diamond(double baseStateUpdateRate) {
        super(baseStateUpdateRate);
        this.setCooker(new Hearth());
    }

    @Override
    public IngredientType getIngredientType() {
        return IngredientType.DIAMOND;
    }

    @Override
    public String getName() {
        return "钻石";
    }
}
