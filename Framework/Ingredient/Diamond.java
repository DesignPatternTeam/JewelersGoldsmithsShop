package Framework.Ingredient;
import Framework.Tool.Hearth;

public class Diamond extends Ingredient {
    Diamond(double baseStateUpdateRate) {
        // super(baseStateUpdateRate);
        this.setTool(new Hearth());
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
