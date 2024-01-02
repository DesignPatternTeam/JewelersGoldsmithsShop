package Framework.Ingredient;
import Framework.Tool.ProcessTop;

public class Gold extends Ingredient {
    Gold() {
        this.setTool(new ProcessTop());
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
