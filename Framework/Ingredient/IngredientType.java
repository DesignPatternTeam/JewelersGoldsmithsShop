package Framework.Ingredient;

public enum IngredientType {
    GOLD("金"), SILVER("银"), JADE("玉石"), DIAMOND("钻石");

    String name;

    IngredientType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
