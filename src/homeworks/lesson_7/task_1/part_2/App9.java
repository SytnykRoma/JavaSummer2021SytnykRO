package homeworks.lesson_7.task_1.part_2;

//При переопределении (overriding) список исключений потомка не обязан совпадать с таковым у предка.
//Но он должен быть «не сильнее» списка предка:
import java.io.FileNotFoundException;
import java.io.IOException;

public class App9 {
    // предок пугает IOException и InterruptedException
    public void f() throws IOException, InterruptedException {}
}

class Child extends App9 {
    // а потомок пугает только потомком IOException
    @Override
    public void f() throws FileNotFoundException {}
}