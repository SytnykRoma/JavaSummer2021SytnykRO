package homeworks.lesson_7.task_2.controller;

import java.util.Scanner;

import homeworks.lesson_7.task_2.model.Model;
import homeworks.lesson_7.task_2.view.View;

import static homeworks.lesson_7.task_2.controller.RegexContainer.*;
import static homeworks.lesson_7.task_2.view.TextConstants.*;

import homeworks.lesson_7.task_2.model.entity.NoteBook;
import homeworks.lesson_7.task_2.model.entity.NotUniqueLoginException;

/**
 * Created by student on 12.07.2021.
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner inputFieldsScanner = new Scanner(System.in);

        view.printMessage(view.bundle.getString(START));

        InputRecord inputRecord = new InputRecord(inputFieldsScanner, view);
        inputRecord.inputRecord(inputFieldsScanner);

        NoteBook noteBook = getNoteBook(inputRecord);
        System.out.println(noteBook);
    }

    public NoteBook getNoteBook (InputRecord inputRecord) {
        NoteBook noteBook = null;
        while(true) {
            try {
                noteBook = new NoteBook(inputRecord.getLastname(), inputRecord.getLogin());
                break;
            } catch (NotUniqueLoginException e) {
                e.printStackTrace();
                view.printMessage(view.bundle.getString(NOT_UNIQUE_LOGIN));
                inputRecord.inputLogin();
            }
        }
        return noteBook;
    }
}
