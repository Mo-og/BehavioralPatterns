package Visitor;

public class DeveloperJunior_Visitor implements Developer_Visitor {
    @Override
    public void performTaskOne() {
        System.out.println("Junior is learning patterns...");
    }

    @Override
    public void performTaskTwo() {
        System.out.println("Junior is making UML diagrams...");
    }

    @Override
    public void performTaskThree() {
        System.out.println("Junior is writing some code.");
    }
}
