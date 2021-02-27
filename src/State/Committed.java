package State;

public class Committed implements State{
    @Override
    public void changeState(ChangedFile changedFile) {
        System.out.println("Changed state to Committed");
        // saveAsCommited();
        System.out.println("File has been pinned to latest commit");
        changedFile.setState(this);
    }

    @Override
    public String toString() {
        return "Status: Committed";
    }
}
