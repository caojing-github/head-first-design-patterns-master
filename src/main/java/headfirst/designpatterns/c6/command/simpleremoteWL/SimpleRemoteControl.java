package headfirst.designpatterns.c6.command.simpleremoteWL;

/**
 * 遥控器（调用者）
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
