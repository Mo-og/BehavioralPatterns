package Command;

import java.util.ArrayList;
import java.util.List;

public class CommandsController {
    private List<String> done = new ArrayList<>();
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
        if (done.size() < donePointer + 2) {
            done.add("initiate");
            donePointer = done.lastIndexOf("initiate");
        } else {
            donePointer++;
            done.set(donePointer, "initiate");
        }

    }

    public void clearList() {
        clear.execute();
        if (done.size() < donePointer + 2) {
            done.add("clear");
            donePointer = done.lastIndexOf("clear");
        } else {
            donePointer++;
            done.set(donePointer, "clear");
        }
    }

    public void addToList() {
        add.execute();
        if (done.size() < donePointer + 2) {
            done.add("add");
            donePointer = done.lastIndexOf("add");
        } else {
            donePointer++;
            done.set(donePointer, "add");
        }
    }

    public void subtractFromList() {
        subtract.execute();
        done.add("subtract");
        donePointer = done.lastIndexOf("subtract");
    }

    public void multiplyList() {
        multiply.execute();
        done.add("multiply");
        donePointer = done.lastIndexOf("multiply");
    }

    public void divideList() {
        divide.execute();
        done.add("divide");
        donePointer = done.lastIndexOf("divide");
    }

    public void undo() {
        switch (done.get(donePointer)) {
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
        if (undonePointer < donePointer || undonePointer - 1 > done.size()) {
            System.out.println("Nothing to redo");
            return;
        }
        int tempDone = donePointer;
        int tempUndone = undonePointer;
        donePointer = undonePointer;
        switch (done.get(donePointer)) {
            case "initiate" -> initiate.execute();
            case "clear" -> clear.execute();
            case "add" -> add.execute();
            case "subtract" -> subtract.execute();
            case "multiply" -> multiply.execute();
            case "divide" -> divide.execute();
        }
        undonePointer++;

    }

    void repoint() {

    }
}
