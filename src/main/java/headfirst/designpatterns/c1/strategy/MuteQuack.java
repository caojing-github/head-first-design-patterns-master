package headfirst.designpatterns.c1.strategy;

/**
 * 不会叫
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
