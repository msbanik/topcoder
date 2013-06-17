import org.junit.Test;

import static org.junit.Assert.*;

public class TwoRotationCypherTest {

    @Test
    public void test0() {
        int firstSize = 13;
        int firstRotate = 0;
        int secondRotate = 0;
        String message = "this string will not change at all";
        assertEquals("this string will not change at all", new TwoRotationCypher().encrypt(firstSize, firstRotate, secondRotate, message));
    }

    @Test
    public void test1() {
        int firstSize = 13;
        int firstRotate = 7;
        int secondRotate = 0;
        String message = "only the letters a to m in this string change";
        assertEquals("onfy tbl flttlrs h to g cn tbcs strcna jbhnal", new TwoRotationCypher().encrypt(firstSize, firstRotate, secondRotate, message));
    }

    @Test
    public void test2() {
        int firstSize = 9;
        int firstRotate = 0;
        int secondRotate = 16;
        String message = "j to z will change here";
        assertEquals("z sn y vikk chamge heqe", new TwoRotationCypher().encrypt(firstSize, firstRotate, secondRotate, message));
    }

    @Test
    public void test3() {
        int firstSize = 17;
        int firstRotate = 9;
        int secondRotate = 5;
        String message = "the quick brown fox jumped over the lazy dog";
        assertEquals("yqn izalc kwgsf ogt bzehnm grnw yqn djvu mgp", new TwoRotationCypher().encrypt(firstSize, firstRotate, secondRotate, message));
    }

    @Test
    public void test4() {
        int firstSize = 3;
        int firstRotate = 1;
        int secondRotate = 2;
        String message = "  watch   out for strange  spacing ";
        assertEquals("  ybvaj   qwv hqt uvtbpig  urbakpi ", new TwoRotationCypher().encrypt(firstSize, firstRotate, secondRotate, message));
    }
}
