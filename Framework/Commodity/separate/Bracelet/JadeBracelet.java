package Framework.Commodity.separate.Bracelet;

import Framework.Ingredient.IngredientType;

import java.util.List;

public class JadeBracelet extends Bracelet{
    public JadeBracelet(List<IngredientType> requirements, double price) {
        super(requirements, price);
    }

    @Override
    public String getName() {
        return "玉镯";
    }
}