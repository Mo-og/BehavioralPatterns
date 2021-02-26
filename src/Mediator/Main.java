package Mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator=new ConcreteMediator();
        Colleague user1 = new ChatMember_ConcreteColleague(mediator,"user1");
        Colleague user2 = new ChatMember_ConcreteColleague(mediator, "user2");

        mediator.addColleague(user1);
        mediator.addColleague(user2);

        user2.send("Hi");
        user1.send("Hello");
    }
}
