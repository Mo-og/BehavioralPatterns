package Mediator;

public abstract class Colleague {
    protected Mediator mediator;
    protected String username;

    public Colleague(Mediator mediator, String username) {
        this.mediator = mediator;
        this.username = username;
    }
    public abstract void send(String message);
    public abstract void receive(String message);
}
