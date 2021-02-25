package Command.Example;

import Command.Command;

public class StartCondition implements Command{
    private Condition condition;

    public StartCondition(Condition condition){
        this.condition = condition;
    }

    public void execute(){
        condition.start();
    }
}

class Condition{
    public void start(){
        System.out.println("Condition start!");

    }
}