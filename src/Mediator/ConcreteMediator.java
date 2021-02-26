package Mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator{
    private List<Colleague> colleagues;

    public ConcreteMediator() {
        this.colleagues = new ArrayList<Colleague>();
    }

    @Override
    public void addColleague(Colleague colleague) {
        this.colleagues.add(colleague);
    }

    @Override
    public void sendMessage(Colleague currentColleague, String message) {
        for (Colleague colleague : this.colleagues){
            if (colleague != currentColleague) colleague.receive(message);
        }
    }
}
