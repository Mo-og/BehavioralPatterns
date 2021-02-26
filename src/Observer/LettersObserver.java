package Observer;

public class LettersObserver extends Observer {
    private String string;

    public LettersObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
        string = process(subject.getState());
    }

    private String process(String s) {
        if (s==null||s.isEmpty()) return s;
        return s.replaceAll("\\W*\\d*_*", "");
    }

    @Override
    public void update() {
        string = process(subject.getState());
        System.out.println("Current letters: " + string);
    }
}
