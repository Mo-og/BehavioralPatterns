package Memento;

public class Backup_Memento {
    private final String state;
    private final String modificationDate;

    public Backup_Memento(String state, String modificationDate) {
        this.state = state;
        this.modificationDate = modificationDate;
    }

    public String getState() {
        return state;
    }
    public String getModificationDate() {
        return modificationDate;
    }

}
