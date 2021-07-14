package homeworks.lesson_7.task_1.part_2;

//Вызов метода, который «пугает» unchecked исключением не накладывает на нас никаких обязанностей.
public class App1 {
    public static void main(String[] args) {
        f();
    }
    public static void f() throws RuntimeException {
    }
}