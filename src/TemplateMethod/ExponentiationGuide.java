package TemplateMethod;

public class ExponentiationGuide extends Template {
    public ExponentiationGuide(double a, double b) {
        super(a, b);
    }

    @Override
    protected String actionName() {
        return "raise a to the power of b";
    }

    @Override
    protected void showResult() {
        System.out.println("a^b = " + Math.pow(a,b));
    }
}
