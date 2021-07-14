package homeworks.lesson_7.task_2.controller;

import java.util.Scanner;

import homeworks.lesson_7.task_2.view.View;
import static homeworks.lesson_7.task_2.view.TextConstants.*;
import static homeworks.lesson_7.task_2.controller.RegexContainer.*;

/**
 * Created by student on 12.07.2021.
 */
public class InputRecord {
    private Scanner scanner;
    private View view;

    private String lastname;
    private String login;

    public InputRecord(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public void inputRecord(Scanner scanner) {
        RegexValidation regexValidation = new RegexValidation(scanner, view);

        String lastnameLocale = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_LASTNAME_UKR
                : REGEX_LASTNAME_LAT;

        view.printMessage(view.bundle.getString(INPUT_LASTNAME));
        this.lastname = regexValidation.regexValidationForInput(scanner, lastnameLocale);

        view.printMessage(view.bundle.getString(INPUT_LOGIN));
        this.login = regexValidation.regexValidationForInput(scanner, REGEX_LOGIN);
    }

    public void inputLogin() {
        RegexValidation regexValidation = new RegexValidation(scanner, view);
        this.login = regexValidation.regexValidationForInput(scanner, REGEX_LOGIN);
    }

    public String getLastname() {
        return lastname;
    }

    public String getLogin() {
        return login;
    }
}
