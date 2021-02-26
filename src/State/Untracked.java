package State;

public class Untracked implements State{
    @Override
    public void changeState(ChangedFile changedFile) {
        System.out.println("Set file state to Untracked");
        changedFile.setState(this);
    }
    @Override
    public String toString() {
        return "Status: Untracked";
    }
}
