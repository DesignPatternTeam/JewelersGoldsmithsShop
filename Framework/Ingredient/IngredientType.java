package Framework.Ingredient;

public enum IngredientType {
    GOLD("金"), SILVER("银"), JADE("玉石"), DIAMOND("钻石");

    final String name;

    IngredientType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
