package Framework.Container;

import java.util.ArrayList;
import java.util.Arrays;

import Framework.Boss.BossVisitor;
import Framework.Ingredient.IngredientType;

public class Vault extends Container{
    private Vault(){
        super(new ArrayList<>(Arrays.asList(
                IngredientType.GOLD,
                IngredientType.SILVER,
                IngredientType.DIAMOND,
                IngredientType.JADE)));

        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("Already initialized.");
        }
    }

    private static Vault instance;

    public static synchronized Vault getInstance() {
        if (instance == null) {
            instance = new Vault();
        }

        return instance;
    }

    public String getName() {
        return "保险柜";
    }

    @Override
    public void accept(BossVisitor visitor) {
        visitor.visit(this);
    }
}
