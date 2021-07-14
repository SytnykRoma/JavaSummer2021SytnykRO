package homeworks.lesson_7.task_1.part_2;

//Мы можем точно указать, что выбрасываем
import java.io.EOFException;
import java.io.FileNotFoundException;

public class App2 {
    // пугаем ОБОИМИ исключениями
    public static void main(String[] args) throws EOFException, FileNotFoundException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }
}