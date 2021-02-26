package State;

public class ChangedFile {
    private State state;

    public ChangedFile() {
        this.state = new Untracked();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
