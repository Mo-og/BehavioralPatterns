package Command;

import java.util.ArrayList;
import java.util.List;

public class CommandsController {
    private List<String> history = new ArrayList<>();
    private int donePointer = 0;
    private int undonePointer = 0;
    private Command initiate;
    private Command clear;
    private Command add;
    private Command subtract;
    private Command multiply;
    private Command divide;

    public CommandsController(Command initiate, Command clear, Command add, Command subtract, Command multiply, Command divide) {
        this.initiate = initiate;
        this.clear = clear;
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
    }

    public void initiateList() {
        initiate.execute();
        if (history.size() < donePointer + 2) {
            history.add("initiate");
            donePointer = history.lastIndexOf("initiate");
        } else {
            donePointer++;
            history.set(donePointer, "initiate");
        }

    }

    public void clearList() {
        clear.execute();
        if (history.size() < donePointer + 2) {
            history.add("clear");
            donePointer = history.lastIndexOf("clear");
        } else {
            donePointer++;
            history.set(donePointer, "clear");
        }
    }

    public void addToList() {
        add.execute();
        if (history.size() < donePointer + 2) {
            history.add("add");
            donePointer = history.lastIndexOf("add");
        } else {
            donePointer++;
            history.set(donePointer, "add");
        }
    }

    public void subtractFromList() {
        subtract.execute();
        history.add("subtract");
        donePointer = history.lastIndexOf("subtract");
    }

    public void multiplyList() {
        multiply.execute();
        history.add("multiply");
        donePointer = history.lastIndexOf("multiply");
    }

    public void divideList() {
        divide.execute();
        history.add("divide");
        donePointer = history.lastIndexOf("divide");
    }

    public void undo() {
        switch (history.get(donePointer)) {
            case "initiate" -> clear.execute();
            case "clear" -> initiate.execute();
            case "add" -> subtract.execute();
            case "subtract" -> add.execute();
            case "multiply" -> divide.execute();
            case "divide" -> multiply.execute();
        }
        undonePointer = donePointer;
        donePointer -= 1;
    }

    public void redo() {
        if (undonePointer < donePointer || undonePointer - 1 > history.size()) {
            System.out.println("Nothing to redo");
            return;
        }
        int tempDone = donePointer;
        int tempUndone = undonePointer;
        donePointer = undonePointer;
        switch (history.get(donePointer)) {
            case "initiate" -> initiate.execute();
            case "clear" -> clear.execute();
            case "add" -> add.execute();
            case "subtract" -> subtract.execute();
            case "multiply" -> multiply.execute();
            case "divide" -> divide.execute();
        }
        undonePointer++;

    }
}
