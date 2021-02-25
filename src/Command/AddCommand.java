package Command;

public class AddCommand implements Command{
    ListHandler handler;

    public AddCommand(ListHandler handler) {
        this.handler = handler;
    }

    @Override
    public void execute() {
        handler.add();
    }
}
