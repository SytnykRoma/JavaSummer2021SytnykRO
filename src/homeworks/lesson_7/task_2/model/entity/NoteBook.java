package homeworks.lesson_7.task_2.model.entity;

import static homeworks.lesson_7.task_2.view.View.*;
import static homeworks.lesson_7.task_2.view.TextConstants.*;

/**
 * Created by student on 12.07.2021.
 */
public class NoteBook {
    private String lastname;
    private String login;

    public NoteBook(String lastname, String login) throws NotUniqueLoginException {
        if (DBNoteBook.notUniqueLoginValidation(login)) {
            throw new NotUniqueLoginException("Not Unique Login!", login);
        }
        this.lastname = lastname;
        this.login = login;
    }


    @Override
    public String toString() {
        return "\n" + bundle.getString(LASTNAME) + ": " + lastname + "\n" + bundle.getString(LOGIN) + ": " + login;
    }


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
