import org.junit.Test;

import static org.junit.Assert.*;

public class PastingPaintingDivTwoTest {

    @Test
    public void test0() {
        String[] clipboard = new String[]{
                "..B",
                "B..",
                "BB."
        };
        int T = 3;
        assertEquals(10L, new PastingPaintingDivTwo().countColors(clipboard, T));
    }

    @Test
    public void test1() {
        String[] clipboard = new String[]{
                "B...",
                "....",
                "....",
                "...B"
        };
        int T = 2;
        assertEquals(4L, new PastingPaintingDivTwo().countColors(clipboard, T));
    }

    @Test
    public void test2() {
        String[] clipboard = new String[]{"BBB"};
        int T = 10000;
        assertEquals(30000L, new PastingPaintingDivTwo().countColors(clipboard, T));
    }

    @Test
    public void test3() {
        String[] clipboard = new String[]{"."};
        int T = 1000000000;
        assertEquals(0L, new PastingPaintingDivTwo().countColors(clipboard, T));
    }

    @Test
    public void test4() {
        String[] clipboard = new String[]{
                "BB.",
                ".B."
        };
        int T = 100;
        assertEquals(201L, new PastingPaintingDivTwo().countColors(clipboard, T));
    }

    @Test
    public void test5() {
        String[] clipboard = new String[]{
                "..........B..........",
                ".........B.B.........",
                "........B...B........",
                ".......B.....B.......",
                "......B..B.B..B......",
                ".....B...B.B...B.....",
                "....B...........B....",
                "...B...B.....B...B...",
                "..B.....BBBBBB....B..",
                ".B..........BB.....B.",
                "BBBBBBBBBBBBBBBBBBBBB"
        };
        int T = 1000000000;
        assertEquals(21000000071L, new PastingPaintingDivTwo().countColors(clipboard, T));
    }
}
