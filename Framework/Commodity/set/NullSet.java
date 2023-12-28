package Framework.Commodity.set;

import java.util.ArrayList;

public class NullSet extends Set {
    public NullSet() {
        super(new ArrayList<>());
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void handle() {

    }
}
