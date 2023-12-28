package framework.ingredient;


import framework.cooker.CounterTop;

public class Silver extends Ingredient {

    Silver(double baseStateUpdateRate) {
        super(baseStateUpdateRate);
        this.setCooker(new CounterTop());
    }

    @Override
    public IngredientType getIngredientType() {
        return IngredientType.SILVER;
    }

    @Override
    public String getName() {
        return "银";
    }
}
