package homeworks.lesson_5.controller;

import homeworks.lesson_5.model.Model;
import homeworks.lesson_5.view.View;
import static homeworks.lesson_5.controller.RegexContainer.*;
import static homeworks.lesson_5.view.TextConstants.*;

import java.util.Scanner;

/**
 * Created by student on 07.07.2021.
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner inputFields = new Scanner(System.in);

        String lastname;
        String nickname;

        String str = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_LASTNAME_UKR : REGEX_LASTNAME_LAT;

        view.printMessage(view.bundle.getString(START));

        view.printMessage(view.bundle.getString(INPUT_LASTNAME));
        lastname = validationForInput(inputFields, str);
        model.setLastname(lastname);

        view.printMessage(view.bundle.getString(INPUT_NICKNAME));
        nickname = validationForInput(inputFields, REGEX_NICKNAME);
        model.setNickname(nickname);

        view.printResult(model.getLastname(), model.getNickname());
    }

    public String validationForInput(Scanner scanner, String regex) {
        String inputTry;
        boolean restartValidation = false;
        do {
            inputTry = scanner.next();
            if (inputTry.matches(regex)) {
                restartValidation = false;
            }
            else {
                view.printMessage(view.bundle.getString(INPUT_ERROR));
                restartValidation = true;
            }
        } while (restartValidation);
        return inputTry;
    }
}
