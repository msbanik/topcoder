import java.util.*;

public class HyperKnight {
    int a, b, numRows, numColumns, k;

    public long countCells(int a, int b, int numRows, int numColumns, int k) {
        this.a = a;
        this.b = b;
        this.numRows = numRows;
        this.numColumns = numColumns;
        this.k = k;
        int max = Math.max(a, b);
        long total = 0;
        for (int i = 0; i < max; i++) {
            for (int r = 0; r < numRows; r++) {
//                System.out.printf("%d %d \n", r, i);
                if (check(r, i))
                    total++;
                if (check(r, numColumns - 1 - i))
                    total++;
//                System.out.printf("%d %d \n", r, numColumns - 1 - i);
            }
            for (int c = 0; c < numColumns; c++) {
//                System.out.printf("%d %d \n", i + 1, c);
                if (check(i + 1, c))
                    total++;
//                System.out.printf("%d %d \n", numRows - 2 - i, c);
                if (check(numRows - 2 - i, c))
                    total++;
            }
        }

        return total;
    }

    private boolean check(int x, int y) {
        int[][] val = new int[][]{{x + a, y + b}, {x + a, y - b}, {x - a, y + b}, {x - a, y - b}, {x + b, y + a}, {x + b, y - a}, {x - b, y + a}, {x - b, y - a}};
        int count = 0;
        for (int i = 0; i < val.length; i++) {
            int[] ints = val[i];
            if ((ints[0] > -1 && ints[0] < numRows) && (ints[1] > -1 && ints[1] < numColumns)) {
                count++;
            }
        }
        if (count == k) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        new HyperKnight().countCells(2, 1, 8, 8, 4);
    }
}
