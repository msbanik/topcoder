import java.util.*;

public class EvenRoute {
    public String isItPossible(int[] x, int[] y, int wantedParity) {
        int len = x.length, a, b, m = 0, n = 0, step = 0, extra;
        for (int i = 0; i < len; i++) {
            a = x[i];
            b = y[i];
            step += Math.abs(m - a) + Math.abs(n - b);
            m = a;
            n = b;
        }
        if (step % 2 == wantedParity) {
            return "CAN";
        } else {
            for (int i = 1; i < len; i++) {
                a = x[i];
                b = y[i];
                extra = Math.abs(0 - a) + Math.abs(0 - b);
                step += extra;
                if (step % 2 == wantedParity) {
                    return "CAN";
                }
                step -= extra;
            }
        }
        return "CANNOT";
    }
}
