package Framework.Commodity.separate;

public class NullSeparatePurchase extends SeparatePurchase {
    public NullSeparatePurchase() {
        super(0);
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void process() {
    }
}
