import java.util.*;

public class PillarsDivTwo {
    public double maximalLength(int[] height, int w) {
        int i0 = height[0], i1;
        double rl = 0;
        for (int i = 1; i < height.length; i++) {
            i1 = height[i];
            if (i0 < i1) {
                rl += p(w, i1 - 1);


            }
            i0 = i1;
        }
        return 0;
    }

    private double p(int w, int i) {
        return Math.sqrt(w * w + i * i);
    }
}
