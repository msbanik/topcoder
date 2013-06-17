import java.util.*;

public class PatrolRoute {
    public int countRoutes(int X, int Y, int minT, int maxT) {
        int a1, a2, b1, b2, c1, c2, total, count;
        a1 = a2 = b1 = b2 = c1 = c2 = count = 0;

        total = Math.abs(a1 - b1) + Math.abs(a2 - b2) + Math.abs(b1 - c1) + Math.abs(b2 - c2) + Math.abs(c1 - a1) + Math.abs(c2 - a2);
        if (total >= minT && total <= maxT) {
            count++;
        }
        return count;
    }
}
