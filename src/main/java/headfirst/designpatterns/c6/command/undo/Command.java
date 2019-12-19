package headfirst.designpatterns.c6.command.undo;

public interface Command {
    void execute();

    void undo();
}
