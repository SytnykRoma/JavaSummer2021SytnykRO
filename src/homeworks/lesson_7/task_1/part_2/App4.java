package homeworks.lesson_7.task_1.part_2;

//А можем «испугать» сильнее (предком обоих исключений)
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App4 {
    // пугаем ПРЕДКОМ исключений
    public static void main(String[] args) throws IOException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }
}