package homeworks.lesson_7.task_2.controller;

import java.util.Scanner;

import homeworks.lesson_7.task_2.view.TextConstants;
import homeworks.lesson_7.task_2.view.View;

/**
 * Created by student on 12.07.2021.
 */
public class RegexValidation {
    private Scanner scanner;
    private View view;

    public RegexValidation(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    String regexValidationForInput (Scanner scanner, String regex) {
        String inputTry;
        boolean restartValidation;
        do {
            inputTry = scanner.next();
            if (inputTry.matches(regex)) {
                restartValidation = false;
            }
            else {
                view.printMessage(view.bundle.getString(TextConstants.INPUT_ERROR));
                restartValidation = true;
            }
        } while (restartValidation);
        return inputTry;
    }
}
