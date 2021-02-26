package Strategy;

public class NumbersOnlyStrategy implements Strategy {
    @Override
    public String execute(String a, String b) {
        System.out.println("Executing Numbers + ' ' Strategy");
        return a.replaceAll("\\D*", "").concat(" " + b.replaceAll("\\D*", "_"));
    }
}
