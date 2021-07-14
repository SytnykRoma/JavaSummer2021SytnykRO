package homeworks.lesson_7.task_2.model.entity;

/**
 * Created by student on 12.07.2021.
 */
public enum DBNoteBook {
    NOTE_ONE("Taras", "taras123"),
    NOTE_TWO("Nikola","nik12345"),
    NOTE_THREE ("Petro","shoko123");

    private final String lastname;
    private final String login;

    DBNoteBook(String lastname, String login) {
        this.lastname = lastname;
        this.login = login;
    }

    public String getFirstName() {
        return lastname;
    }
    public String getLogin() {
        return login;
    }

    public static boolean notUniqueLoginValidation (String login){
        for (DBNoteBook note : DBNoteBook.values()){
            if (note.getLogin().equals(login)){
                return true;
            }
        }
        return  false;
    }
}
