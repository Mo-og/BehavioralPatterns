package Mediator;

public interface Mediator {
    void addColleague(Colleague colleague);
    void sendMessage(Colleague colleague, String message);
}
