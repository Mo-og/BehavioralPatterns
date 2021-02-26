package Strategy;

public class LettersNumbersStrategy implements Strategy{
    @Override
    public String execute(String a, String b) {
        System.out.println("Executing Letters-Numbers Strategy");
        return a.replaceAll("\\W*\\d*_*","").concat(b.replaceAll("\\D*",""));
    }
}
