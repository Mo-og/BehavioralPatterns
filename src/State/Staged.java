package State;

public class Staged implements State{
    @Override
    public void changeState(ChangedFile changedFile) {
        System.out.println("Changed state to Staged");
        changedFile.setState(this);
    }

    @Override
    public String toString() {
        return "Status: Staged for commit";
    }
}
