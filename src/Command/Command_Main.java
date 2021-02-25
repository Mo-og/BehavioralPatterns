package Command;

import java.util.ArrayList;
import java.util.List;

public class Command_Main {
    public static void main(String[] args) {
        /*RemoteControl remoteControl = new RemoteControl(); //создаем пулт управления
        Engine engine = new Engine();   // создаем двигатель
        StartEngine startEngine = new StartEngine(engine); //создаем команду для запуска двигателя
        Condition condition = new Condition(); //создаем кондиционер
        StartCondition startCondition = new StartCondition(condition); //создаем команду для запуска кондиционера

        List commands = new ArrayList(); // список для хранения последовательности команд
        commands.add(startEngine); // добавляем команду запуска двигателя
        commands.add(startCondition); //добавляем команду для запуска кондиционера

        CompoundCommand compCom = new CompoundCommand(commands);


        // назначаем команду запуска двигателя на кнопку 0  на пульте
        remoteControl.setCommand(0, startEngine);
        // назначаем команду запуска двигателя и прогрева салона на кнопку 1 на пульте
        remoteControl.setCommand(1, compCom);
        remoteControl.buttonPress(1); //нажимаем кнопку*/

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