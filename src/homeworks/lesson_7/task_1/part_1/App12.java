package homeworks.lesson_7.task_1.part_1;

//finally-секция получает управление, даже если try-блок завершился исключением
public class App12 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            System.err.println("finally");
        }
    }
}

//>> finally
//>> Exception in thread "main" java.lang.RuntimeException