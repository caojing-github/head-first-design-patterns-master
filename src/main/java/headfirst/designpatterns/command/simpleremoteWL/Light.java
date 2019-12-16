package headfirst.designpatterns.command.simpleremoteWL;

/**
 * 灯（接受者）
 */
public class Light {

    public Light() {
    }

    public void on() {
        System.out.println("Light is on");
    }

    public void off() {
        System.out.println("Light is off");
    }
}
