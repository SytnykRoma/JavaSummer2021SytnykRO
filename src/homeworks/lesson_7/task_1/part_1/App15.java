package homeworks.lesson_7.task_1.part_1;

//Есть исключение но нет подходящего catch
public class App15 {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch(Error e) {
            System.err.print(" 2");
        } finally {
            System.err.print(" 3");
        }
        System.err.print(" 4");
    }
}

//>> 0 3
//>> RUNTIME ERROR: Exception in thread "main" java.lang.RuntimeException