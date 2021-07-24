package headfirst.designpatterns.c10.state.gumballstatewinner;

public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

    void refill();
}
