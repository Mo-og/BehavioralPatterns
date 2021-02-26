package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        new MultiplicationGuide(5,7.35).execute();
        System.out.println();
        new ExponentiationGuide(2,8).execute();
    }
}
