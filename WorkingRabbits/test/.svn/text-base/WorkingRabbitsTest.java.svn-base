import org.junit.Test;

import static org.junit.Assert.*;

public class WorkingRabbitsTest {

    @Test
    public void test0() {
        String[] profit = new String[]{"071",
                "702",
                "120"};
        assertEquals(3.3333333333333335, new WorkingRabbits().getEfficiency(profit), 1e-9);
    }

    @Test
    public void test1() {
        String[] profit = new String[]{"00",
                "00"};
        assertEquals(0.0, new WorkingRabbits().getEfficiency(profit), 1e-9);
    }

    @Test
    public void test2() {
        String[] profit = new String[]{"0999",
                "9099",
                "9909",
                "9990"};
        assertEquals(9.0, new WorkingRabbits().getEfficiency(profit), 1e-9);
    }

    @Test
    public void test3() {
        String[] profit = new String[]{
                "013040",
                "100010",
                "300060",
                "000008",
                "416000",
                "000800"};
        assertEquals(1.5333333333333334, new WorkingRabbits().getEfficiency(profit), 1e-9);
    }

    @Test
    public void test4() {
        String[] profit = new String[]{"06390061",
                "60960062",
                "39090270",
                "96900262",
                "00000212",
                "00222026",
                "66761201",
                "12022610"};
        assertEquals(3.2142857142857144, new WorkingRabbits().getEfficiency(profit), 1e-9);
    }
}
