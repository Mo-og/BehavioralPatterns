package Visitor;

public class Main {
    public static void main(String[] args) {
        TasksForTeam_Element tasksForTeamElement =new TasksForTeam_Element();

        Developer_Visitor junior = new DeveloperJunior_Visitor();
        Developer_Visitor senior = new DeveloperMiddle_Visitor();

        tasksForTeamElement.accept(junior);
        System.out.println("\n");
        tasksForTeamElement.accept(senior);
    }
}
