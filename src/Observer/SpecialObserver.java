package Observer;

public class SpecialObserver extends Observer{
    public SpecialObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Current special characters: " + subject.getState().replaceAll("[^_\\W]*",""));
    }
}
