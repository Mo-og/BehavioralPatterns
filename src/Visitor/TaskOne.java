package Visitor;

public class TaskOne implements Task_Element {
    @Override
    public void accept(Developer_Visitor developerVisitor) {
        developerVisitor.performTaskOne();
    }
}
