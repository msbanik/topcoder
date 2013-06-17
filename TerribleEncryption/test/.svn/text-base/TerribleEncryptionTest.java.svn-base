import org.junit.Test;

import static org.junit.Assert.*;

public class TerribleEncryptionTest {

    @Test
    public void test0() {
        String pool = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] keys = new int[]{17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17};
        assertEquals("BJGNHDFPCMOKELI", new TerribleEncryption().decrypt(pool, data, keys));
    }

    @Test
    public void test1() {
        String pool = "AEIOUAEIOUaeiouaeiou";
        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5};
        int[] keys = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 16, 17, 18};
        assertEquals("EIOUAEIOUaEOeoe", new TerribleEncryption().decrypt(pool, data, keys));
    }

    @Test
    public void test2() {
        String pool = "abcdeffedcbaABCDEFFEDCBA";
        int[] data = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int[] keys = new int[]{3, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41};
        assertEquals("bfbeAcedecB", new TerribleEncryption().decrypt(pool, data, keys));
    }

    @Test
    public void test3() {
        String pool = "abcdefghijklmnopqrstuvwxyz";
        int[] data = new int[]{11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11};
        int[] keys = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17};
        assertEquals("bcdbfcdfblgjldo", new TerribleEncryption().decrypt(pool, data, keys));
    }

    @Test
    public void test4() {
        String pool = "HmmBlahHmmBlah";
        int[] data = new int[]{1, 1, 1, 1, 1, 1, 1};
        int[] keys = new int[]{10, 9, 8, 7, 6, 5, 4};
        assertEquals("mmmmmmm", new TerribleEncryption().decrypt(pool, data, keys));
    }
}
