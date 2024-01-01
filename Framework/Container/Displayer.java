package Framework.Container;

import java.util.ArrayList;
import java.util.Arrays;

import Framework.Boss.BossVisitor;
import Framework.Ingredient.IngredientType;

public class Displayer extends Container{
    private Displayer(){
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

    private static Displayer instance;

    public static synchronized Displayer getInstance() {
        if (instance == null) {
            instance = new Displayer();
        }

        return instance;
    }

    public String getName() {
        return "展台";
    }

    @Override
    public void accept(BossVisitor visitor) {
        visitor.visit(this);
    }
}
