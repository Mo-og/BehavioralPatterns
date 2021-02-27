package Memento;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BackupManager_Caretaker {
    private Backup_Memento backup;
    private Map<Integer, Backup_Memento> map = new HashMap<>();
    int currentVersion = 0;

    public void saveState(SomeFile_Originator file) {
        if (file == null)
            throw new NullPointerException("Cannot save file state because file is null");
        backup = file.getBackup();
        map.put(currentVersion++, backup);
        System.out.println("Successfully created backup: ");
        file.print();
    }

    public void loadState(SomeFile_Originator file, int version) {
        if (file == null)
            throw new NullPointerException("Cannot restore file state because file is null.");
        if (backup == null)
            throw new NullPointerException("Cannot restore file state because no backup is available.");
        if (!map.containsKey(version)){
            System.out.println("No such version");
            return;
        }
        backup = map.get(version);
        file.restoreFromBackup(backup);
        System.out.println("Successfully restored from backup: ");
    }
}
