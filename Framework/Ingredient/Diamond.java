package Framework.Ingredient;
import Framework.Tool.OperatorTop;

public class Diamond extends Ingredient {
    Diamond() {
        this.setTool(new OperatorTop());
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
