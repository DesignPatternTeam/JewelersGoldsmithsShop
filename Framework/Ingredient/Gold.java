package Framework.Ingredient;
import Framework.Tool.Hearth;

public class Gold extends Ingredient {
    Gold() {
        this.setTool(new Hearth());
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
