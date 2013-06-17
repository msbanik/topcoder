import java.util.*;

public class TwoRectangles {
    public String describeIntersection(int[] a, int[] b) {
        if (a[0] > b[2] || a[2] < b[0] || a[1] > b[3] || a[3] < b[1]) {
            return "none";
        } else if ((a[0] == b[2] && a[1] == b[3]) || (a[0] == b[2] && a[3] == b[1]) || (a[2] == b[0] && a[3] == b[1]) || (a[2] == b[0] && a[1] == b[3])) {
            return "point";
        } else if (a[0] == b[2] || a[2] == b[0] || a[1] == b[3] || a[3] == b[1]) {
            return "segment";
        } else
            return "rectangle";
    }
}
