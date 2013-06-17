import org.junit.Test;

import static org.junit.Assert.*;

public class PaternityTestTest {

    @Test
    public void test0() {
        String child = "ABCD";
        String mother = "AXCY";
        String[] men = new String[]{"SBTD", "QRCD"};
        assertArrayEquals(new int[]{0}, new PaternityTest().possibleFathers(child, mother, men));
    }

    @Test
    public void test1() {
        String child = "ABCD";
        String mother = "ABCX";
        String[] men = new String[]{"ABCY", "ASTD", "QBCD"};
        assertArrayEquals(new int[]{1, 2}, new PaternityTest().possibleFathers(child, mother, men));
    }

    @Test
    public void test2() {
        String child = "ABABAB";
        String mother = "ABABAB";
        String[] men = new String[]{"ABABAB", "ABABCC", "ABCCDD", "CCDDEE"};
        assertArrayEquals(new int[]{0, 1}, new PaternityTest().possibleFathers(child, mother, men));
    }

    @Test
    public void test3() {
        String child = "YZGLSYQT";
        String mother = "YUQRWYQT";
        String[] men = new String[]{"YZQLDPWT", "BZELSWQM", "OZGPSFKT", "GZTKFYQT", "WQJLSMQT"};
        assertArrayEquals(new int[]{}, new PaternityTest().possibleFathers(child, mother, men));
    }

    @Test
    public void test4() {
        String child = "WXETPYCHUWSQEMKKYNVP";
        String mother = "AXQTUQVAUOSQEEKCYNVP";
        String[] men = new String[]{"WNELPYCHXWXPCMNKDDXD",
                "WFEEPYCHFWDNPMKKALIW",
                "WSEFPYCHEWEFGMPKIQCK",
                "WAEXPYCHAWEQXMSKYARN",
                "WKEXPYCHYWLLFMGKKFBB"};
        assertArrayEquals(new int[]{1, 3}, new PaternityTest().possibleFathers(child, mother, men));
    }
}
