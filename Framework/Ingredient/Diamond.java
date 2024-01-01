package Framework.Ingredient;
import Framework.Tool.CounterTop;

public class Diamond extends Ingredient {
    Diamond() {
        this.setTool(new CounterTop());
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
