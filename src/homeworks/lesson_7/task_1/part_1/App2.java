package homeworks.lesson_7.task_1.part_1;

//catch:
//Годится
public class App2 {
    public static void main(String[] args) {
        try {
        } catch (Throwable t) {}
    }
}

/* Не годится
public class App {
    public static void main(String[] args) {
        try {
        } catch (String s) {}
    }
}

>> COMPILATION ERROR: Incompatible types: required 'java.lang.Throwable', found: 'java.lang.String'
*/