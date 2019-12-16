package headfirst.designpatterns.command.remoteWL;

/**
 * 遥控器（调用者）
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        for (int i = 0; i < 7; i++) {
            onCommands[i] = () -> {
            };
            offCommands[i] = () -> {
            };
        }
    }

    /**
     * @param slot       插槽的位置
     * @param onCommand  开的命令
     * @param offCommand 关的命令
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /**
     * 开
     *
     * @param slot 插槽的位置
     */
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    /**
     * 关
     *
     * @param slot 插槽的位置
     */
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    /**
     * 打印出每个插槽和它对应的命令
     */
    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }

}
