package homeworks.lesson_7.task_1.part_1;

//finally-секция получает управление, если try-блок завершился успешно
public class App11 {
    public static void main(String[] args) {
        try {
            System.err.println("try");
        } finally {
            System.err.println("finally");
        }
    }
}

//>> try
//>> finally