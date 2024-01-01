package Framework.Commodity.separate.fingerring;

import Framework.Ingredient.IngredientType;

import java.util.List;

public class DiamondInlaidGoldRing extends Fingerring{
    public DiamondInlaidGoldRing(List<IngredientType> requirements, double price) {
        super(requirements, price);
    }

    @Override
    public String getName() {
        return "镶钻金戒指";
    }
}
