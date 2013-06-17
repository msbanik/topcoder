import java.util.*;

public class CuttingBitString {
    static ArrayList<String> strings;
    static int min = 100;

    public int getmin(String S) {
        min = 100;
        strings = new ArrayList<String>();
        for (int i = 0; i < 50; i++) {
            strings.add(Long.toBinaryString((long) Math.pow(5, i)));
        }
        m(S, 0);
        if (min == 100) {
            return -1;
        }
        return min;
    }

    private void m(String s, int i) {
        if (s.equals("")) {
            min = Math.min(i, min);
        }
        for (int len = 1; len <= s.length(); len++) {
            if (strings.contains(s.substring(0, len))) {
                m(s.substring(len), i + 1);
            }
        }
    }
}
