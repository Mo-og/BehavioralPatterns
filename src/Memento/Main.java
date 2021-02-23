package Memento;

public class Main {
    public static void main(String[] args) {
        SomeFile_Originator file = new SomeFile_Originator("a; b; c; d");
        BackupManager_Caretaker caretaker = new BackupManager_Caretaker();

        caretaker.saveState(file);
        System.out.println("Modifying...");
        file.processFile();
        System.out.println("Now file is: ");
        file.print();
        caretaker.loadState(file);
        System.out.println("Now file is: ");
        file.print();
    }
}
