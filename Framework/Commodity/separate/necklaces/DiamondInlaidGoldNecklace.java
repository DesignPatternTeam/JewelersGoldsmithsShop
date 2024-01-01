package Framework.Commodity.separate.necklaces;

import Framework.Ingredient.IngredientType;

import java.util.List;

public class DiamondInlaidGoldNecklace extends Necklaces{
    public DiamondInlaidGoldNecklace(List<IngredientType> requirements, double price) {
        super(requirements, price);
    }

    @Override
    public String getName() {
        return "镶钻金项链";
    }
}
