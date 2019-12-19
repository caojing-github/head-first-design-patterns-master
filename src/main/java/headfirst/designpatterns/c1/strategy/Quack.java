package headfirst.designpatterns.c1.strategy;

/**
 * 呱呱叫
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
