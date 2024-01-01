package Framework.Commodity.combo;

import Framework.Commodity.Commodity;
import Framework.Commodity.separate.SeparatePurchase;

import java.util.ArrayList;

public abstract class ComboPurchase extends Commodity {
    private final ArrayList<SeparatePurchase> commodityComposite = new ArrayList<>();

    ComboPurchase(ArrayList<SeparatePurchase> commodityComposite) {
        super(
                commodityComposite.stream().mapToDouble(Commodity::getPrice).reduce(0, Double::sum)
        );

        this.commodityComposite.addAll(commodityComposite);
    }

    @Override
    public void process() {
        System.out.println("开始处理" + this.getName() + "...");
        for (Commodity commodity : commodityComposite) {
            commodity.process();
        }
        System.out.println("\n" + this.getName() + "处理完成啦！");
    }
}
