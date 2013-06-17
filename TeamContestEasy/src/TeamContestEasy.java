import java.util.*;

public class TeamContestEasy {
    public int worstRank(int[] strength) {
        int rank = 1, pow;
        if (strength.length > 3) {

            boolean[] flag = new boolean[strength.length];
            Arrays.sort(strength, 3, strength.length);
            pow = strength[0] + strength[1] + strength[2] - Math.min(Math.min(strength[0], strength[1]), strength[2]);
            int m = 3, sh = m + 1, h = strength.length - 1;
            flag[m] = true;    //used up
            while (h > sh) {
                //scan
                if (flag[h]) {
                    h--;
                }
                if (!flag[h] && !flag[sh] && (strength[h] + strength[sh]) > pow) {
                    flag[h] = true;
                    flag[sh] = true;
                    rank++;
                    while (flag[++m]) {
                        if (m == strength.length - 1) {
                            break;
                        }
                    }
                    sh = m + 1;
                }else{
                    sh++;
                }
            }
        }
        return rank;
    }
}
