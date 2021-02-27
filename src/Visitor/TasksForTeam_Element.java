package Visitor;

public class TasksForTeam_Element implements Task_Element {
    Task_Element[] taskElements;

    public TasksForTeam_Element() {
        this.taskElements = new Task_Element[]{
                new TaskOne(),
                new TaskTwo(),
                new TaskThree(),
        };
    }

    @Override
    public void accept(Developer_Visitor developerVisitor) {
        for (var element : taskElements){
            element.accept(developerVisitor);
        }
    }
}
