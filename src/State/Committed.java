package State;

public class Committed implements State{
    @Override
    public void changeState(ChangedFile changedFile) {
        System.out.println("Changed state to Committed");
        changedFile.setState(this);
    }

    @Override
    public String toString() {
        return "Status: Committed";
    }
}
