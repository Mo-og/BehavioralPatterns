package Interpereter;

public class LettersOnlyExpression implements Expression {
    private String string;

    public LettersOnlyExpression(String string) {
        this.string = string;
    }

    @Override
    public String interpret(Context context) {
        return context.getLettersOnly(string);
    }
}
