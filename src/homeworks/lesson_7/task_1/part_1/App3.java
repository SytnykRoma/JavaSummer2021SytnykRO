package homeworks.lesson_7.task_1.part_1;

//throw:
//Годится
public class App3 {
    public static void main(String[] args) {
        // Error - потомок Throwable
        throw new Error();
    }
}

/*
Не годится
public class App {
    public static void main(String[] args) {
        throw new String("Hello!");
    }
}

>> COMPILATION ERROR: Incompatible types: required 'java.lang.Throwable', found: 'java.lang.String'
 */