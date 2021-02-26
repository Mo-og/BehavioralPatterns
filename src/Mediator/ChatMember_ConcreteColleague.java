package Mediator;

public class ChatMember_ConcreteColleague extends Colleague {
    public ChatMember_ConcreteColleague(Mediator mediator, String username) {
        super(mediator, username);
    }

    @Override
    public void send(String message) {
        System.out.println(this.username + " sent: " + message);
        mediator.sendMessage(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.username + " received a message: " + message);
    }
}
