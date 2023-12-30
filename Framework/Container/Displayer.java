package Framework.Container;

import java.util.ArrayList;
import java.util.Arrays;
import Framework.Ingredient.IngredientType;
import Framework.Boss.BossVistor;

public class Displayer extends Container{
    private Displayer(){
        super(new ArrayList<>(Arrays.asList(
                IngredientType.ROWNODDLE,
                IngredientType.PAKCHOI)));

        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("Already initialized.");
        }
    }

    private static Displayer instance;

    public static synchronized Vault getInstance() {
        if (instance == null) {
            instance = new Displayer();
        }

        return instance;
    }

    public String getName() {
        return "展台";
    }

    @Override
    public void accept(BossVistor visitor) {
        visitor.visit(this);
    }
}
