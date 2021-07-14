package homeworks.lesson_7.task_2.model.entity;

/**
 * Created by student on 12.07.2021.
 */
public class NotUniqueLoginException extends Exception {
    private String login;

    public String getLogin() {
        return login;
    }

    public NotUniqueLoginException(String message, String login) {
        super(message);
        this.login = login;
    }
}