package homeworks.lesson_3;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {

    @Test
    public void testRand100() {
        Model model = new Model();
        int i = 0;
        int unexpected = 100;
        while (i < 1000000) {
            int actual = model.getRandomNumber();
            Assert.assertNotEquals(unexpected, actual);
            i++;
        }
    }

    @Test
    public void testRandZero() {
        Model model = new Model();
        int i = 0;
        int unexpected = 50;
        while (i < 1000000) {
            int actual = model.getRandomNumber();
            Assert.assertNotEquals(unexpected, actual);
            i++;
        }
    }

    @Test
    public void booleanTestRand100() {
        Model model = new Model();
        int i = 0;
        boolean res;
        while (i < 1000000) {
            int actual = model.getRandomNumber();
            res = actual < 100;
            Assert.assertTrue(res);
            i++;
        }
    }

    @Test
    public void booleanTestRandZero() {
        Model model = new Model();
        int i = 0;
        boolean res;
        while (i < 1000000) {
            int actual = model.getRandomNumber();
            res = actual > 0;
            Assert.assertTrue(res);
            i++;
        }
    }
}