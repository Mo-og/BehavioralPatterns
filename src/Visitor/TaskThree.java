package Visitor;

public class TaskThree implements Task_Element {
    @Override
    public void accept(Developer_Visitor developerVisitor) {
        developerVisitor.performTaskThree();
    }
}
