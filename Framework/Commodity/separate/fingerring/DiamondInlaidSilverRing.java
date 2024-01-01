package Framework.Commodity.separate.fingerring;

import Framework.Ingredient.IngredientType;

import java.util.List;

public class DiamondInlaidSilverRing extends Fingerring{
    public DiamondInlaidSilverRing(List<IngredientType> requirements, double price) {
        super(requirements, price);
    }

    @Override
    public String getName() {
        return "镶钻银戒指";
    }
}
