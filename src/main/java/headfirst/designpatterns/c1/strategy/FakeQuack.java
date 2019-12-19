package headfirst.designpatterns.c1.strategy;

/**
 *
 */
public class FakeQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Qwak");
    }
}
