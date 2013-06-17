import org.junit.Test;

import static org.junit.Assert.*;

public class UndoHistoryTest {

    @Test
    public void test0() {
        String[] lines = new String[]{"tomorrow", "topcoder"};
        assertEquals(18, new UndoHistory().minPresses(lines));
    }

    @Test
    public void test1() {
        String[] lines = new String[]{"a", "b"};
        assertEquals(6, new UndoHistory().minPresses(lines));
    }

    @Test
    public void test2() {
        String[] lines = new String[]{"a", "ab", "abac", "abacus"};
        assertEquals(10, new UndoHistory().minPresses(lines));
    }

    @Test
    public void test3() {
        String[] lines = new String[]{"pyramid", "sphinx", "sphere", "python", "serpent"};
        assertEquals(39, new UndoHistory().minPresses(lines));
    }

    @Test
    public void test4() {
        String[] lines = new String[]{"ba", "a", "a", "b", "ba"};
        assertEquals(13, new UndoHistory().minPresses(lines));
    }

    @Test
    public void test5() {
        String[] lines = new String[]{"a", "aa", "aaa"};
        assertEquals(6, new UndoHistory().minPresses(lines));
    }
}
