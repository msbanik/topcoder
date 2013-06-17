import java.util.*;

public class PrimalUnlicensedCreatures {
    public int maxWins(int initialLevel, int[] grezPower) {
        int count = 0;
        int i;
        boolean[] visit = new boolean[grezPower.length];
        boolean flag;
        while (true) {
            flag = false;
            for (i = 0; i < grezPower.length; i++) {
                if (!visit[i] && initialLevel > grezPower[i]) {
                    visit[i] = true;
                    count++;
                    initialLevel += (grezPower[i] / 2);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        return count;
    }
}
