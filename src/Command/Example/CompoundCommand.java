package Command.Example;

import Command.Command;

import java.util.ArrayList;
import java.util.List;

public class CompoundCommand implements Command {
    private final List<Command> commands;

    public CompoundCommand(List<Command> commands) {
        this.commands = commands;
    }

    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}