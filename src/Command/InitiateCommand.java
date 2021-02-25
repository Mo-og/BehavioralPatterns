package Command;

public class InitiateCommand implements Command{
    ListHandler handler;

    public InitiateCommand(ListHandler handler) {
        this.handler = handler;
    }

    @Override
    public void execute() {
        handler.initiate();
    }
}
