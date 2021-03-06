package headfirst.designpatterns.c6.command.simpleremote;

/**
 * 关灯（命令对象）
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
