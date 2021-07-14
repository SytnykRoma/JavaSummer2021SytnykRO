package homeworks.lesson_7.task_1.part_2;

//Если вы часть перехватили, то можете этим не пугать
import java.io.EOFException;
import java.io.FileNotFoundException;

public class App6 {
    // EOFException перехватили catch-ом, им не пугаем
    public static void main(String[] args) throws FileNotFoundException {
        try {
            if (System.currentTimeMillis() % 2 == 0) {
                throw new EOFException();
            } else {
                throw new FileNotFoundException();
            }
        } catch (EOFException e) {
            // ...
        }
    }
}