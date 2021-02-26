package Observer;

public class NumbersObserver extends Observer {
    public NumbersObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Current digits: " + subject.getState().replaceAll("\\D*",""));
    }
}
