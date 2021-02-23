package Memento;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SomeFile_Originator {
    private String state;
    private String modificationDate;

    public SomeFile_Originator(String state) {
        this.state = state;
        this.modificationDate = new SimpleDateFormat("dd.MM.yy - HH:mm:ss:SS").format(new Date());
    }

    public void processFile() {
        if (state != null && !state.isEmpty()) {
            state = state.substring(
                    (state.length() > state.lastIndexOf(';') + 1
                            ? state.lastIndexOf(';') + 1
                            : state.lastIndexOf(';')
                    )
            );
            modificationDate = new SimpleDateFormat("dd.MM.yy - HH:mm:ss:SS").format(new Date());
        }
    }

    public void print() {
        System.out.println(state + "\nLast modified: " + modificationDate);
    }

    public void restoreFromBackup(Backup_Memento memento) {
        state = memento.getState();
        modificationDate = memento.getModificationDate();
    }

    public Backup_Memento getBackup() {
        return new Backup_Memento(state, modificationDate);
    }
}
