package homeworks.lesson_7.task_1.part_1;

public class App4 {
    public static void main(String[] args) {
        System.out.println("sout");
        throw new Error();
    }
}

// System.out — buffered-поток вывода, а System.err — нет. Таким образом вывод может быть как таким
// >> RUNTIME ERROR: Exception in thread "main" java.lang.Error
// >> sout

// Так и вот таким (err обогнало out при выводе в консоль)
// >> sout
// >> RUNTIME ERROR: Exception in thread "main" java.lang.Error