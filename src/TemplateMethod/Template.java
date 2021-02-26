package TemplateMethod;

public abstract class Template {
    protected double a, b;

    public Template(double a, double b) {
        this.a = a;
        this.b = b;
    }

    protected abstract String actionName();

    protected abstract void showResult();

    public final void execute() {
        System.out.println("There are two numbers:\nA = " + a + "\nB = " + b);
        System.out.println("If we " + actionName());
        System.out.println("The result will be: ");
        showResult();
    }

}
