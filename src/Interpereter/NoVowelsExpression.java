package Interpereter;

public class NoVowelsExpression implements Expression {
    private String string;

    public NoVowelsExpression(String string) {
        this.string = string;
    }

    @Override
    public String interpret(Context context) {
        return context.getWithoutVowels(string);
    }
}
