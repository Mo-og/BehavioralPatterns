package Visitor;

public class DeveloperMiddle_Visitor implements Developer_Visitor {
    @Override
    public void performTaskOne() {
        System.out.println("Refactoring and fixing junior's code...");
    }

    @Override
    public void performTaskTwo() {
        System.out.println("Solving a task from a team lead...");
    }

    @Override
    public void performTaskThree() {
        System.out.println("Testing own and junior's code.");
    }
}
