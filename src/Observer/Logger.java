package Observer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger extends Observer {
    private String state;

    public Logger(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
        state = subject.getState();
    }

    @Override
    public void update() {
        if (subject.getState() == null || state == null) return;
        if (!state.equals(subject.getState())) {
            System.out.println("Data update detected at " + new SimpleDateFormat("HH:mm:ss:SS").format(new Date()));
        } else System.out.println("Nothing has changed");
        state=subject.getState();
    }
}
