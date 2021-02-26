package Observer;

public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();

        var l = new LettersObserver(subject);
        var n = new NumbersObserver(subject);
        var s = new SpecialObserver(subject);
        new Logger(subject);

        String s1 = "a1b2c3_^&*(DEF-456!gH)";
        String s2 = "IJK:78_9?/|lm=0";
        System.out.println("String: " + s1);
        subject.setState(s1);
        System.out.println("\nString: " + s2);
        subject.setState(s2);

        subject.detach(l);
        subject.detach(n);
        subject.detach(s);

        System.out.println("\nString: " + s2);
        subject.setState(s2);


    }
}
