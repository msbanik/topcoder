import org.junit.Test;

import static org.junit.Assert.*;

public class StampTest {

    @Test
    public void test0() {
        String desiredColor = "RRGGBB";
        int stampCost = 1;
        int pushCost = 1;
        assertEquals(5, new Stamp().getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void test1() {
        String desiredColor = "R**GB*";
        int stampCost = 1;
        int pushCost = 1;
        assertEquals(5, new Stamp().getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void test2() {
        String desiredColor = "BRRB";
        int stampCost = 2;
        int pushCost = 7;
        assertEquals(30, new Stamp().getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void test3() {
        String desiredColor = "R*RR*GG";
        int stampCost = 10;
        int pushCost = 58;
        assertEquals(204, new Stamp().getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void test4() {
        String desiredColor = "*B**B**B*BB*G*BBB**B**B*";
        int stampCost = 5;
        int pushCost = 2;
        assertEquals(33, new Stamp().getMinimumCost(desiredColor, stampCost, pushCost));
    }

    @Test
    public void test5() {
        String desiredColor = "*R*RG*G*GR*RGG*G*GGR***RR*GG";
        int stampCost = 7;
        int pushCost = 1;
        assertEquals(30, new Stamp().getMinimumCost(desiredColor, stampCost, pushCost));
    }
}
