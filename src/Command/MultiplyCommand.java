package Command;

public class MultiplyCommand implements Command {
    ListHandler handler;

    public MultiplyCommand(ListHandler handler) {
        this.handler = handler;
    }

    @Override
    public void execute() {
        handler.multiply();
    }
}
