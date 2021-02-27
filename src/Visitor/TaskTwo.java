package Visitor;

public class TaskTwo implements Task_Element {
    @Override
    public void accept(Developer_Visitor developerVisitor) {
        developerVisitor.performTaskTwo();
    }
}
