package State;

public class Modified implements State{
    @Override
    public void changeState(ChangedFile changedFile) {
        System.out.println("Changed state to Modified");
        changedFile.setState(this);
    }

    @Override
    public String toString() {
        return "Status: Modified";
    }
}
