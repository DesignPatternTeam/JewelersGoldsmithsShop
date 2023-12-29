package Framework.Container;

import java.util.ArrayList;
import java.util.Arrays;
import Framework.Ingredient.IngredientType;
import Framework.Boss.BossVistor;

public class Vault extends Container{
    private Vault(){
        super(new ArrayList<>(Arrays.asList(
                IngredientType.ROWNODDLE,
                IngredientType.PAKCHOI)));

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
    public void accept(BossVistor visitor) {
        visitor.visit(this);
    }
}
