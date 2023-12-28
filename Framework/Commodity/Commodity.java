package Framework.Commodity;

public abstract class Commodity {
    private double price;

    public double getPrice() {
        return price;
    }

    public Commodity(double price) {
        this.price = price;
    }

    public abstract String getName();

    public abstract void handle();
}
