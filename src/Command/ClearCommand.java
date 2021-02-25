package Command;

public class ClearCommand implements Command{
    ListHandler handler;

    public ClearCommand(ListHandler handler) {
        this.handler = handler;
    }

    @Override
    public void execute() {
        handler.clear();
    }
}
