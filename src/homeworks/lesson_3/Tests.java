package homeworks.lesson_3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {

    @Test
    public void testRand100() {
        Model model = new Model();
        int i = 0;
        while (i < 1000) {
            int actual = model.getRandomNumber();
            Assert.assertNotEquals(actual, 100);
            i++;
        }
    }

    @Test
    public void testRand1() {
        Model model = new Model();
        int i = 0;
        while (i < 1000) {
            int actual = model.getRandomNumber();
            Assert.assertNotEquals(actual, 1);
            i++;
        }
    }
}