import java.util.*;

public class KingdomAndTrees {
    public int minLevel(int[] heights) {
        int prev = heights[0];
        int x = 0, r;
        int extra;
        boolean fixed = false;
        for (int i = 1; i < heights.length; i++) {
            int height = heights[i];
            if (prev == height) {
                prev += 1;
                x = Math.max(x, 1);
            } else if (prev < height) {
                extra = height - (prev + 1);
                if (extra > x) {
                    prev = prev + 1 + (extra - x);
                } else {
                    prev = prev + 1;
                }
            } else {//prev > height
                extra = prev - height;
                if (!fixed) {
                    fixed = true;
                    r = extra / 2 + 1;
                    prev += r;
                    x = Math.max(x, r);
                } else {
                    prev = height + extra + 1;
                    x = Math.max(x, extra + 1);
                }
            }
        }
        return x;
    }
}
