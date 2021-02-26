package TemplateMethod;

public class MultiplicationGuide extends Template {
    public MultiplicationGuide(double a, double b) {
        super(a, b);
    }

    @Override
    protected String actionName() {
        return "multiply a by b";
    }

    @Override
    protected void showResult() {
        System.out.println("a * b = " + a * b);
    }
}
