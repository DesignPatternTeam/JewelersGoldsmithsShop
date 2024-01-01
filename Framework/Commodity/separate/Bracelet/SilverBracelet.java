package Framework.Commodity.separate.Bracelet;

import Framework.Ingredient.IngredientType;

import java.util.List;

public class SilverBracelet extends Bracelet{
    public SilverBracelet(List<IngredientType> requirements, double price) {
        super(requirements, price);
    }

    @Override
    public String getName() {
        return "银镯";
    }
}
