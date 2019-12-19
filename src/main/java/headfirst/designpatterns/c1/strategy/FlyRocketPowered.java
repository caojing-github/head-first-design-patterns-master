package headfirst.designpatterns.c1.strategy;

/**
 * 🚀火箭似飞
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
