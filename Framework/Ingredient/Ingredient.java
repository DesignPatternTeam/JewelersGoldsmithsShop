package Framework.Ingredient;

/**
 * Strategy, Prototype, Memento
 */
public abstract class Ingredient implements TimeObserver, Cloneable {

    private IngredientState state = new IngredientFreshState();

    private double stateRate;

    // 基础磨损速率
    // 实际磨损速率为 baseStateUpdateRate * stateUpdateRate
    private double baseStateUpdateRate;

    // 磨损速率基准
    private double stateUpdateRate = 1;

    Ingredient(double stateUpdateRate) {
        this.stateRate = Math.random() * 100;
        this.baseStateUpdateRate = stateUpdateRate;
        Timer.getInstance().addObserver(this);
    }

    private Cooker cooker;

    /**
     * 设置处理材料的工具
     * DP: Strategy
     * @param cooker
     */
    public void setCooker(Cooker cooker) {
        this.cooker = cooker;
    }

    /**
     * 使用设置的工具加工
     * DP: Strategy
     */
    public void doCook() {
        cooker.cook(this);
    }

    /**
     * 材料可使用程度更新
     * 由 Timer.tick() 触发
     */
    public final void update() {
        if (isStale() || isCooked()) return;
        this.stateRate += baseStateUpdateRate * stateUpdateRate;
        if (stateRate >= 100) {
            state = new IngredientStaleState();
        }
    }

    public void changeState(IngredientStateType type) {
        this.state = IngredientStateFactory.getState(type);
    }

    /**
     * 是否损坏
     *
     * @return boolean
     */
    public boolean isStale() {
        return state.isStale(this);
    }

    public boolean isCooked() { return state.isCooked(this); }

    public abstract IngredientType getIngredientType();

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object clone = null;
        try {
            clone = super.clone();
            Timer.getInstance().addObserver((TimeObserver) clone);
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return clone;
    }

    public abstract String getName();

    public void displayInfo() {
        if (this.isStale()) {
            System.out.println("  一个已经损坏的" + this.getName());
        } else {
            System.out.println("  一个全新的" + this.getName() + " 可使用指数为" + this.stateRate);
        }
    }

    public void setMemento(IngredientMemento memento) {
        this.state = ((IngredientMementoInternal) memento).getState();
        this.stateRate = ((IngredientMementoInternal) memento).getStateRate();
    }

    public IngredientMemento getMemento() {
        IngredientMementoInternal memento = new IngredientMementoInternal();
        memento.setState(state);
        memento.setStateRate(stateRate);
        return memento;
    }

    // Memento
    // 保存材料的状态和可使用程度
    public static class IngredientMementoInternal implements IngredientMemento {

        private IngredientState state;

        private double stateRate;

        public IngredientState getState() {
            return state;
        }

        public void setState(IngredientState state) {
            this.state = state;
        }

        public double getStateRate() {
            return stateRate;
        }

        public void setStateRate(double stateRate) {
            this.stateRate = stateRate;
        }

    }
}
