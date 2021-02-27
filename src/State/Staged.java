package State;

public class Staged implements State{
    @Override
    public void changeState(ChangedFile changedFile) {
        System.out.println("Changed state to Staged");
        //
        System.out.println("File is ready to be committed");
        changedFile.setState(this);
    }

    @Override
    public String toString() {
        return "Status: Staged for commit";
    }
}
