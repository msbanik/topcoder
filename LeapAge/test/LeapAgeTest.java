import org.junit.Test;

import static org.junit.Assert.*;

public class LeapAgeTest {

    @Test
    public void test0() {
        int year = 2004;
        int born = 1980;
        assertEquals(6, new LeapAge().getAge(year, born));
    }

    @Test
    public void test1() {
        int year = 10000;
        int born = 1582;
        assertEquals(2042, new LeapAge().getAge(year, born));
    }

    @Test
    public void test2() {
        int year = 2007;
        int born = 1981;
        assertEquals(6, new LeapAge().getAge(year, born));
    }

    @Test
    public void test3() {
        int year = 1981;
        int born = 1980;
        assertEquals(0, new LeapAge().getAge(year, born));
    }

    @Test
    public void test4() {
        int year = 1984;
        int born = 1983;
        assertEquals(1, new LeapAge().getAge(year, born));
    }

    @Test
    public void test5() {
        int year = 9700;
        int born = 5795;
        assertEquals(947, new LeapAge().getAge(year, born));
    }
}
