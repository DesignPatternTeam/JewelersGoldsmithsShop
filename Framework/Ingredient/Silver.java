package Framework.Ingredient;
import Framework.Tool.ProcessTop;

public class Silver extends Ingredient {

    Silver() {
        this.setTool(new ProcessTop());
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
