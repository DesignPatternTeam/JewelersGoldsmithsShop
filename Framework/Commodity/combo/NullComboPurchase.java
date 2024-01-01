package Framework.Commodity.combo;

import java.util.ArrayList;

public class NullComboPurchase extends ComboPurchase {
    public NullComboPurchase() {
        super(new ArrayList<>());
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void process() {}
}
