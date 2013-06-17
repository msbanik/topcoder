import java.util.*;

public class WorkingRabbits {
    public double getEfficiency(String[] profit) {
        int q = 0, p = 0;
        for (int i = 0; i < profit.length; i++) {
            String s = profit[i];
            for (int j = 0; j < s.length(); j++) {
                if (i < j) {
                    q++;
                    if ((s.charAt(j) - '0') > 0) {
                        p += (s.charAt(j) - '0');
                    }
                }
            }
        }
        if (q == 0) {
            return 0;
        }
        return (double) p / q;
    }
}
