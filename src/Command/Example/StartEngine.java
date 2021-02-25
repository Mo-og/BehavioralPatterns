package Command.Example;

import Command.Command;

public class StartEngine implements Command{
    private Engine engine;

    public StartEngine(Engine engine){
        this.engine = engine;
    }

    public void execute(){
        engine.start();
    }
}
