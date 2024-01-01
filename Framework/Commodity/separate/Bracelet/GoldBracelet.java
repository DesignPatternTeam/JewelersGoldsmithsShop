package Framework.Commodity.separate.Bracelet;

import Framework.Ingredient.IngredientType;

import java.util.List;

public class GoldBracelet extends Bracelet{
    public GoldBracelet(List<IngredientType> requirements, double price) {
        super(requirements, price);
    }

    @Override
    public String getName() {
        return "金镯";
    }

}
