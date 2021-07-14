package homeworks.lesson_7.task_1.part_1;

//Или даже вот так
public class App17 {
    public static void main(String[] args) {
        try {
            try {
                //...
            } catch (Exception e) {
                //...
            } finally {
                //...
            }
        } catch (Exception e) {
            try {
                //...
            } catch (Exception e1) {
                //...
            } finally {
                //...
            }
        } finally {
            try {
                //...
            } catch (Exception e) {
                //...
            } finally {
                //...
            }
        }
    }
}