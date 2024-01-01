package Framework.Commodity.separate.necklaces;

import Framework.Ingredient.IngredientType;

import java.util.List;

public class JadeInlaidGoldNecklace extends Necklaces{
    public JadeInlaidGoldNecklace(List<IngredientType> requirements, double price) {
        super(requirements, price);
    }

    @Override
    public String getName() {
        return "镶玉金项链";
    }
}
