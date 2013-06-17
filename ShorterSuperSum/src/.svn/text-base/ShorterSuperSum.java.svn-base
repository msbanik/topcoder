import java.util.*;

public class ShorterSuperSum {
    public int calculate(int k, int n) {
        int sum, i, j, m;
        int[][] memo = new int[k + 1][n + 1];
        for (i = 1; i <= n; i++) {
            memo[0][i] = i;
        }

        for (i = 1; i <= k; i++) {
            for (j = 1; j <= n; j++) {
                sum = 0;
                for (m = 1; m <= j; m++) {
                    sum += memo[i - 1][m];
                }
                memo[i][j] = sum;
            }
        }
        return memo[k][n];
    }
}
