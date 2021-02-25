package Interpereter;

public class NoConsonantsExpression implements Expression {
    private String string;

    public NoConsonantsExpression(String string) {
        this.string = string;
    }

    @Override
    public String interpret(Context context) {
        return context.getWithoutConsonants(string);
    }
}
