import java.util.*;

public class BinaryPolynomialDivTwo {
    public int countRoots(int[] a) {
        int root = 0;
        if (a[0] == 0) {
            root++;
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            count += a[i];
        }
        if (count % 2 == 0) {
            root++;
        }
        return root;
    }
}
