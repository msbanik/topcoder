import java.util.*;

public class RandomColoringDiv2 {
    public int getCount(int maxR, int maxG, int maxB, int startR, int startG, int startB, int d1, int d2) {
        return m(startR, maxR, d1, d2) * m(startG, maxG, d1, d2) * m(startB, maxB, d1, d2);
    }

    int m(int startR, int maxR, int d1, int d2) {
        int count = 0;
        for (int i = 0; i <= maxR; i++) {
            if ((Math.abs(i - startR) >= d1) && (Math.abs(i - startR) <= d2)) {
                count++;
            }
        }
        return count;
    }
}
