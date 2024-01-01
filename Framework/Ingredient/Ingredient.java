package Framework.Ingredient;

import Framework.Ingredient.state.State;
import Framework.Ingredient.state.StateFactory;
import Framework.Ingredient.state.StateType;
import Framework.Ingredient.state.UnprocessedState;
import Framework.Tool.Tool;

/**
 * Strategy, Prototype, Memento
 */
public abstract class Ingredient implements Cloneable {

    private State state = new UnprocessedState();


    Ingredient() {}

    private Tool tool;

    /**
     * 设置处理材料的工具
     * DP: Strategy
     * @param tool
     */
    public void setCooker(Tool tool) {
        this.tool = tool;
    }

    /**
     * 使用设置的工具加工
     * DP: Strategy
     */
    public void doProcess() {
        tool.process(this);
    }


    public void changeState(StateType type) {
        this.state = StateFactory.getState(type);

    }


    public boolean isProcessed() { return state.isProcessed(this); }

    public abstract IngredientType getIngredientType();

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return clone;
    }

    public abstract String getName();

    public void displayInfo() {
        if (this.isProcessed()) {
            System.out.println("  这块" + this.getName()+ " 已经加工完成了！");
        } else {
            System.out.println("  这块" + this.getName()+ " 还没有加工完成！");
        }
    }

    public void setMemento(IngredientMemento memento) {
        this.state = ((IngredientMementoInternal) memento).getState();
    }

    public IngredientMemento getMemento() {
        IngredientMementoInternal memento = new IngredientMementoInternal();
        memento.setState(state);
        return memento;
    }

    // Memento
    // 保存材料的状态
    public static class IngredientMementoInternal implements IngredientMemento {

        private State state;

        public State getState() {
            return state;
        }

        public void setState(State state) {
            this.state = state;
        }
    }
}
