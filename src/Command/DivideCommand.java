package Command;

public class DivideCommand implements Command {
    ListHandler handler;

    public DivideCommand(ListHandler handler) {
        this.handler = handler;
    }

    @Override
    public void execute() {
        handler.divide();
    }
}
