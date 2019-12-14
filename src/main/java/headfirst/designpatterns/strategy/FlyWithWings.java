package headfirst.designpatterns.strategy;

/**
 * 用翅膀飞
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
