package homeworks.lesson_7.task_2;

import homeworks.lesson_7.task_2.controller.Controller;
import homeworks.lesson_7.task_2.model.Model;
import homeworks.lesson_7.task_2.view.View;

/**
 * Created by student on 12.07.2021
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.processUser();
    }
}