package Framework.Commodity.separate;

public class EmptyPurchase extends SeparatePurchase {
    public EmptyPurchase() {
        super(0);
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void handle() {
    }
}
