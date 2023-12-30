package framework.ingredient;

public enum IngredientType {
    SHRIMP("金"), PORKPATTY("银"), PAKCHOI("玉石"), ROWNODDLE("钻石");

    String name;

    IngredientType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
