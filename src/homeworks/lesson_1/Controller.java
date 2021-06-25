package homeworks.lesson_1;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void activationMethod() {
        Scanner scannerHello = new Scanner(System.in);
        Scanner scannerWorld = new Scanner(System.in);

        model.setHello(validationForHello(scannerHello));
        model.setWorld(validationForWorld(scannerWorld));

        view.printCorrectPhrase(model.getHello(), model.getWorld());
    }

    public String validationForHello(Scanner scanner) {
        view.printMessage(View.TARGET_VALUE_HELLO);
        String checker = scanner.next();
        while (!checker.equals(model.getHello())) {
            view.printMessage(View.INCORRECT_WORD);
            checker = scanner.next();
        }
        return checker;
    }

    public String validationForWorld(Scanner scanner) {
        view.printMessage(View.TARGET_VALUE_WORLD);
        String checker = scanner.nextLine();
        while (!checker.equals(model.getWorld())) {
            view.printMessage(View.INCORRECT_WORD);
            checker = scanner.nextLine();
        }
        return checker;
    }
}