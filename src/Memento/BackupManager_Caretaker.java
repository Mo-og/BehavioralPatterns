package Memento;

public class BackupManager_Caretaker {
    private Backup_Memento backup;

    public void saveState(SomeFile_Originator file)
    {
        if (file == null)
            throw new NullPointerException("Cannot save file state because file is null");
        backup = file.getBackup();
        System.out.println("Successfully created backup: ");
        file.print();
    }

    public void loadState(SomeFile_Originator file)
    {
        if (file == null)
            throw new NullPointerException("Cannot restore file state because file is null.");
        if (backup == null)
            throw new NullPointerException("Cannot restore file state because no backup is available.");

        file.restoreFromBackup(backup);
        System.out.println("Successfully restored from backup: ");
    }
}
