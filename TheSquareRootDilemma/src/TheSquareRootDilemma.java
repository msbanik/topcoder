import java.util.*;

public class TheSquareRootDilemma {
    public int countPairs(int N, int M) {

        int min = Math.min(N, M);
        int max = Math.max(N, M);
        int total = min;
        double eps = 1e-9;

        for (int i = 1; i <= min; i++) {
            for (int j = 1; j <= max; j++) {
                if (i < j) {
                    Double v = Math.sqrt(i) * Math.sqrt(j);
                    if (v - v.intValue() < eps) {
                        System.out.printf("%d, %d\n", i, j);
                        total++;
                        if (j <= min) {
                            System.out.printf("%d, %d\n", j, i);
                            total++;
                        }
                    }
                }
            }
        }
        return total;
    }

}
