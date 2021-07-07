package homeworks.lesson_5.view;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by student on 07.07.2021.
 */
public class View {
    // Resource Bundle Installation's
    static String MESSAGES_BUNDLE_NAME = "\\homeworks\\lesson_5\\properties\\messages";
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
     * @param nickname
     */
    public void printResult(String lastname, String nickname) {
        System.out.println("\nLast name: " + lastname + "\nNickname: " + nickname);
    }
}