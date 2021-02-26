package State;

public class Main {
    public static void main(String[] args) {
        ChangedFile changedFile = new ChangedFile();
        System.out.println(changedFile.getState());

        Modified modified = new Modified();
        modified.changeState(changedFile);
        System.out.println(changedFile.getState());

        Staged staged = new Staged();
        staged.changeState(changedFile);
        System.out.println(changedFile.getState());

        Committed committed = new Committed();
        committed.changeState(changedFile);
        System.out.println(changedFile.getState());

    }
}
