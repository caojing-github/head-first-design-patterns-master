package headfirst.designpatterns.c1.strategy;

/**
 * 橡皮鸭子吱吱叫
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
