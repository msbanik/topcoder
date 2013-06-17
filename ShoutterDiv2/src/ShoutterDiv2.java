import java.util.*;

public class ShoutterDiv2 {
    public int count(int[] s, int[] t) {
        int start, end, nstart, nend, count = 0;

        for (int i = 0; i < s.length; i++) {
            start = s[i];
            end = t[i];
            for (int j = i + 1; j < s.length; j++) {

                if (!(t[j] < start || end < s[j])) {
                    count++;
                }
            }
        }
        return count;
    }
}
