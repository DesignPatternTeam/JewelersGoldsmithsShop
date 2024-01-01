package Framework.Ingredient;
import Framework.Tool.Hearth;

public class Silver extends Ingredient {

    Silver() {
        this.setTool(new Hearth());
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
