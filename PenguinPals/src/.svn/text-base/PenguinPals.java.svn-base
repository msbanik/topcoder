import java.util.*;

public class PenguinPals {

    public static int LEN;
    public static boolean[] boundary;

    public int findMaximumMatching(String colors) {

        LEN = colors.length();
        boundary = new boolean[LEN];
        next(colors, 0, 'R');
        prev(colors, 0, 'R');
        return 0;
    }

    private void prev(String colors, int i, char r) {

    }

    private int prevIndex(int i) {
        return i-- == -1 ? LEN - 1 : i;
    }

    private int nextIndex(int i) {
        return i++ == LEN ? 0 : i;
    }

    private int next(String colors, int i, char r) {
        int j;
        for (int k = 0; k < LEN; k++) {
            j = nextIndex(i);
            if (boundary[j]) {
                return -1;
            } else if (colors.charAt(j) == r) {
                return j;
            }
        }
        return -1;
    }
}
