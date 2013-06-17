import org.junit.Test;

import static org.junit.Assert.*;

public class QuipuReaderTest {

    @Test
    public void test0() {
        String[] knots = new String[]{"-XXXXXXX--XX-----XXXXX---",
                "---XX----XXX-----XXXX----",
                "-XXXXX---XXXXX--XXXXXXXX-"};
        assertArrayEquals(new int[]{725, 234, 558}, new QuipuReader().readKnots(knots));
    }

    @Test
    public void test1() {
        String[] knots = new String[]{"XX---XXXX",
                "XXX-----X"};
        assertArrayEquals(new int[]{24, 31}, new QuipuReader().readKnots(knots));
    }

    @Test
    public void test2() {
        String[] knots = new String[]{"-XXX---XX----X",
                "--X----X-XXXXX",
                "-XX--XXXX---XX"};
        assertArrayEquals(new int[]{321, 115, 242}, new QuipuReader().readKnots(knots));
    }

    @Test
    public void test3() {
        String[] knots = new String[]{"-------X--------",
                "--XXX----XXXX---",
                "--------------XX"};
        assertArrayEquals(new int[]{100, 3040, 2}, new QuipuReader().readKnots(knots));
    }

    @Test
    public void test4() {
        String[] knots = new String[]{"--XXX-XXXXXXXX----------XXXXXXXXX--XXXXXXXX-",
                "--XX----XXXX-----XXXXXX---XXX------XXXXXXXX-",
                "--------------------X----XXXXXXXX--XXXXXXXX-",
                "--XX-------X------XXXX----XXX-------XXXXXX--",
                "--XXX---XXXXX-------X------XX--------X------",
                "-XXXX--XXXXXXX-----------XXXXXXX----XXXXX---",
                "-----------X---XXXXXXXX----XX--------XXX----",
                "-----------X---XXXXXXXX----X----------------",
                "---X--XXXXXXXX--XXXXXXX---XXX---------------",
                "--XX---XXXXXXX--XXXXXXX----XX-------XXXXX---"};
        assertArrayEquals(new int[]{38098, 24638, 188, 21436, 35121, 47075, 1823, 1810, 18730, 27725}, new QuipuReader().readKnots(knots));
    }

    @Test
    public void test5() {
        String[] knots = new String[]{"X", "-"};
        assertArrayEquals(new int[]{1, 0}, new QuipuReader().readKnots(knots));
    }
}
