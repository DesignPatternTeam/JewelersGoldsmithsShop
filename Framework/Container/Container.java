package Framework.Container;

import Framework.Boss.BossVisitor;
import Framework.Ingredient.Ingredient;
import Framework.Ingredient.IngredientFactory;
import Framework.Ingredient.IngredientType;

import java.util.ArrayList;

public abstract class Container {
    ArrayList<Ingredient> ingredients = new ArrayList<>();

    protected ArrayList<IngredientType> availableTypes = new ArrayList<>();

    Container(ArrayList<IngredientType> types){
        System.out.println("现在仓库里有一台"+getName());
        availableTypes = types;
        IngredientFactory factory = new IngredientFactory();
        for (var type : types) {
            ingredients.addAll(factory.createIngredientList(type,2));
        }

    }
    private boolean isIngredientTypeLegal(IngredientType type) {
        return availableTypes.contains(type);
    }

    public void put(Ingredient ingredient) {
        if (!(this.isIngredientTypeLegal(ingredient.getIngredientType()))) {
            throw new IllegalArgumentException("this ingredient doesn't belong here");
        }

        ingredients.add(ingredient);
    }

    public Ingredient fetch(IngredientType type) {

        if (!(this.isIngredientTypeLegal(type))) {
            throw new IllegalArgumentException("this ingredient doesn't belong here");
        }

        for (Ingredient ingredient : ingredients) {
            if (ingredient.getIngredientType() == type) {
                ingredients.remove(ingredient);
                return ingredient;
            }
        }
        throw new IllegalArgumentException("no more stock of this ingredient");
    }

    public boolean has(IngredientType type) {
        if (!(this.isIngredientTypeLegal(type))) {
            throw new IllegalArgumentException("this ingredient doesn't belong here");
        }

        for (Ingredient ingredient : ingredients) {
            if (ingredient.getIngredientType() == type) {
                System.out.println(this.getName() + " 中有需要的 " + ingredient.getName());
                return true;
            }
        }
        System.out.println("Oops，" + this.getName() + " 中没有需要的 " + type);
        return false;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public ContainerIterator Iterator() { return new ContainerIterator(ingredients); }

    public abstract void accept(BossVisitor visitor);
    public abstract String getName();
}
