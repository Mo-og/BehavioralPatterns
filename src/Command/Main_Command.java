package Command;

import java.util.ArrayList;
import java.util.List;

public class Main_Command {
    public static void main(String[] args) {
        ListHandler handler = new ListHandler();
        CommandsController controller = new CommandsController(
                new InitiateCommand(handler),
                new ClearCommand(handler),
                new AddCommand(handler),
                new SubtractCommand(handler),
                new MultiplyCommand(handler),
                new DivideCommand(handler));

        controller.initiateList();
        handler.printList();
        controller.addToList();
        handler.printList();
        controller.undo();
        handler.printList();
        controller.redo();
        handler.printList();
    }
}