package homeworks.lesson_7.task_1.part_1;

//Как происходит выбор «правильного» catch? Да очень просто — JVM идет сверху-вниз до тех пор, пока не найдет такой catch что в нем указано ваше исключение или его предок — туда и заходит. Ниже — не идет.
public class App10 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (RuntimeException e) {
            System.err.println("catch RuntimeException");
        } catch (Exception e) {
            System.err.println("catch Exception");
        } catch (Throwable e) {
            System.err.println("catch Throwable");
        }
        System.err.println("next statement");
    }
}

//>> catch Exception
//>> next statement