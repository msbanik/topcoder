import java.util.*;

public class QuipuReader {
    public int[] readKnots(String[] knots) {

        int knotscount = knots.length;
        StringBuilder[] sb = new StringBuilder[knotscount];
        for (int i = 0; i < knotscount; i++) {
            sb[i] = new StringBuilder();
        }

        int len = knots[0].length();
        boolean flag;
        int start = 0;
        for (int i = 1; i < len; i++) {
            flag = cut(knots, i);
            if (flag) {
                clusterVal(sb, knots, start, i);
                start = i;
            }
        }
        clusterVal(sb, knots, start, len);

        int[] result = new int[knotscount];
        for (int i = 0; i < knotscount; i++) {
            result[i] = Integer.parseInt(sb[i].toString());
        }
        return result;
    }

    public void clusterVal(StringBuilder[] sb, String[] knots, int start, int end) {
        int d;
        boolean flag = false;
        int[] temp = new int[knots.length];
        for (int i = 0; i < knots.length; i++) {
            d = getCount(knots[i].substring(start, end));
            temp[i] = d;
            if (d > 0) {
                flag = true;
            }
        }
        if (flag) {
            for (int i = 0; i < knots.length; i++) {
                sb[i].append(temp[i]);
            }
        }
    }

    public int getCount(String s) {
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == 'X')
                i++;
        }
        return i;
    }


    public boolean cut(String[] knots, int pos) {
        for (int i = 0; i < knots.length; i++) {
            if (knots[i].charAt(pos - 1) == 'X' && knots[i].charAt(pos) == 'X') {
                return false;
            }
        }
        return true;
    }
}
