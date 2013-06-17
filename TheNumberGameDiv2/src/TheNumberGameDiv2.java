import java.util.*;

public class TheNumberGameDiv2 {
    public int minimumMoves(int A, int B) {
        Map<Integer, Integer> dist = new HashMap<Integer, Integer>();
        Queue<Integer> Q = new LinkedList<Integer>();
        Q.add(A);
        dist.put(A, 0);
        while (!Q.isEmpty()) {
            Integer x = Q.poll();
            int[] y = {x / 10, reverse(x)};
            for (int i = 0; i < 2; i++) {
                if (!dist.containsKey(y[i])) {
                    dist.put(y[i], dist.get(x) + 1);
                    Q.add(y[i]);
                }
            }
        }
        return dist.containsKey(B) ? dist.get(B) : -1;
    }
    private static int reverse(int i) {
        int r = 0;
        while (i != 0) {
            r = ( r + (i%10)) * 10;
            i = i / 10;
        }
        return r/10;
    }



    //<editor-fold desc="My solutions">
/*
    public int minimumMoves(int A, int B) {
        String sa = String.valueOf(A);
        String sb = String.valueOf(B);
        StringBuffer buffer = new StringBuffer(sb);
        String sbReverse = buffer.reverse().toString();
        int extra = sa.length() - sb.length();
        int min = Integer.MAX_VALUE;
        if (extra >= 0) {
            if (sa.contains(sb)) {
                if (sa.indexOf(sb) == 0) {
                    min = extra;
                } else {
                    if (sb.equals(sbReverse)) {
                        min = extra + 1;
                    } else
                        min = extra + 2;
                }
            }
            if (sa.contains(sbReverse)) {
                if (sb.length() == 1 && (sa.indexOf(sb) == 0)) {
                    min = Math.min(min, extra);
                } else
                    min = Math.min(min, extra + 1);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }*/
    //</editor-fold>
}
