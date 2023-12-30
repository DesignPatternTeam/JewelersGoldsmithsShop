package Framework.Ingredient;
import Framework.Tool.CounterTop;

public class Gold extends Ingredient {
    Gold(double baseStateUpdateRate) {
        // super(baseStateUpdateRate);
        this.setTool(new CounterTop());
    }

    @Override
    public IngredientType getIngredientType() {
        return IngredientType.GOLD;
    }

    @Override
    public String getName() {
        return "金";
    }
}
