package Interpereter;

public class Main_Interpreter {
    private Context context;

    public Main_Interpreter(Context context) {
        this.context = context;
    }

    public static void main(String[] args) {
        String vowels = "ExcludeVowels: abcdeFGHIJklmnOPQRSTUvWXyz _:-:_ 012345";
        String consonants = "ExcludeConsonants: abcdeFGHIJklmnOPQRSTUvWXyz _:-:_ 012345";
        String letters = "ExcludeNonLetters: abcdeFGHIJklmnOPQRSTUvWXyz _:-:_ 012345";

        Main_Interpreter expression = new Main_Interpreter(new Context());
        System.out.println(vowels + "\n" + expression.interpret(vowels));
        System.out.println("\n" + consonants + "\n" + expression.interpret(consonants));
        System.out.println("\n" + letters + "\n" + expression.interpret(letters));
    }

    private String interpret(String s) {
        Expression expression;
        if (s.startsWith("ExcludeVowels: ")) {
            expression = new NoVowelsExpression(s.substring(s.indexOf(" ", 1) + 1));
        } else if (s.startsWith("ExcludeConsonants: ")) {
            expression = new NoConsonantsExpression(s.substring(s.indexOf(" ", 1) + 1));
        } else if (s.startsWith("ExcludeNonLetters: ")) {
            expression = new LettersOnlyExpression(s.substring(s.indexOf(" ", 1) + 1));
        } else return s;
        return expression.interpret(context);
    }
}
