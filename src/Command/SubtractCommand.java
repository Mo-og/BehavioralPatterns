package Command;

public class SubtractCommand implements Command{
    ListHandler handler;

    public SubtractCommand(ListHandler handler) {
        this.handler = handler;
    }

    @Override
    public void execute() {
        handler.subtract();
    }
}
