package headfirst.designpatterns.c10.state.gumballstate;

public interface State {

    /**
     * 投入25分钱
     */
    void insertQuarter();

    /**
     * 退回25分钱
     */
    void ejectQuarter();

    /**
     * 转动曲柄
     */
    void turnCrank();

    /**
     * 发放糖果
     */
    void dispense();

    /**
     * 添加糖果
     */
    void refill();
}
