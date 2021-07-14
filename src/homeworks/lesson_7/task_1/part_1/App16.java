package homeworks.lesson_7.task_1.part_1;

//Суть в том, что try-cacth-finally тоже допускает неограниченное вложение.
//Например вот так
public class App16 {
    public static void main(String[] args) {
        try {
            try {
                try {
                    //...
                } catch (Exception e) {
                } finally {}
            } catch (Exception e) {
            } finally {}
        } catch (Exception e) {
        } finally {}
    }
}