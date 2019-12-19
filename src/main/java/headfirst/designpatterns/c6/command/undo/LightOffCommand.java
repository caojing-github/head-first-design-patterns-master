package headfirst.designpatterns.c6.command.undo;

/**
 * 关灯（命令对象）
 */
public class LightOffCommand implements Command {
    Light light;
    int level;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        level = light.getLevel();
        light.off();
    }

    @Override
    public void undo() {
        light.dim(level);
    }
}
