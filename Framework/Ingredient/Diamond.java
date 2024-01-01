package Framework.Ingredient;
import Framework.Tool.Hearth;

public class Diamond extends Ingredient {
    Diamond() {
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
