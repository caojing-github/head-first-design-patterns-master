package headfirst.designpatterns.command.remote;

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
