package homeworks.lesson_7.task_2.view;

import java.util.Locale;
import java.util.ResourceBundle;

import static homeworks.lesson_7.task_2.view.TextConstants.*;

/**
 * Created by student on 12.07.2021.
 */
public class View {
    // Resource Bundle Installation's
    static String MESSAGES_BUNDLE_NAME = "\\homeworks\\lesson_7\\task_2\\Resource Bundle 'messages'\\messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("ua", "UA"));        // Ukrainian
                                                         //new Locale("en"));                             // English
    /**
     * Method for outputting messages to the terminal
     *
     * @param message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * Method for outputting the result of program execution
     *
     * @param lastname
     * @param login
     */
    public void printResult(String lastname, String login) {
        System.out.println("\n" + bundle.getString(LASTNAME) + ": " + lastname + "\n" + bundle.getString(LOGIN) + ": " + login);
    }
}