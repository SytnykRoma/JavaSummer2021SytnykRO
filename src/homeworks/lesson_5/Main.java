package homeworks.lesson_5;

import homeworks.lesson_5.controller.Controller;
import homeworks.lesson_5.model.Model;
import homeworks.lesson_5.view.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.processUser();
    }
}