package Framework.Ingredient;
import Framework.Tool.CounterTop;

public class Silver extends Ingredient {

    Silver() {
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
