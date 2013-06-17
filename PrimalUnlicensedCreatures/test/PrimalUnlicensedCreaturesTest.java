import org.junit.Test;

import static org.junit.Assert.*;

public class PrimalUnlicensedCreaturesTest {

    @Test
    public void test0() {
        int initialLevel = 31;
        int[] grezPower = new int[]{10, 20, 30};
        assertEquals(3, new PrimalUnlicensedCreatures().maxWins(initialLevel, grezPower));
    }

    @Test
    public void test1() {
        int initialLevel = 20;
        int[] grezPower = new int[]{24, 5, 6, 38};
        assertEquals(3, new PrimalUnlicensedCreatures().maxWins(initialLevel, grezPower));
    }

    @Test
    public void test2() {
        int initialLevel = 20;
        int[] grezPower = new int[]{3, 3, 3, 3, 3, 1, 25};
        assertEquals(6, new PrimalUnlicensedCreatures().maxWins(initialLevel, grezPower));
    }

    @Test
    public void test3() {
        int initialLevel = 4;
        int[] grezPower = new int[]{3, 13, 6, 4, 9};
        assertEquals(5, new PrimalUnlicensedCreatures().maxWins(initialLevel, grezPower));
    }

    @Test
    public void test4() {
        int initialLevel = 7;
        int[] grezPower = new int[]{7, 8, 9, 10};
        assertEquals(0, new PrimalUnlicensedCreatures().maxWins(initialLevel, grezPower));
    }
}
