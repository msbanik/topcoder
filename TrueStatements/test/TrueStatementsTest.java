import org.junit.Test;

import static org.junit.Assert.*;

public class TrueStatementsTest {

    @Test
    public void test0() {
        int[] statements = new int[]{0, 1, 2, 3};
        assertEquals(1, new TrueStatements().numberTrue(statements));
    }

    @Test
    public void test1() {
        int[] statements = new int[]{0};
        assertEquals(-1, new TrueStatements().numberTrue(statements));
    }

    @Test
    public void test2() {
        int[] statements = new int[]{0, 3, 1, 3, 2, 3};
        assertEquals(3, new TrueStatements().numberTrue(statements));
    }

    @Test
    public void test3() {
        int[] statements = new int[]{1, 1};
        assertEquals(0, new TrueStatements().numberTrue(statements));
    }
}
