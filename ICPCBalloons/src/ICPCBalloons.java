import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class ICPCBalloons {
    public int minRepaintings(int[] balloonCount, String ballonSize, int[] maxAccepted) {
        int n = maxAccepted.length;
        int ans = 1000000000;
        Arrays.sort(maxAccepted);
        ArrayList<Integer> mediumBalloonCount = new ArrayList<Integer>();
        ArrayList<Integer> largeBalloonCount = new ArrayList<Integer>();
        int totalMedium = 0, totalLarge = 0;
        for (int i = 0; i < balloonCount.length; ++i) {
            if (ballonSize.charAt(i) == 'M') {
                mediumBalloonCount.add(balloonCount[i]);
                totalMedium += balloonCount[i];
            } else {
                largeBalloonCount.add(balloonCount[i]);
                totalLarge += balloonCount[i];
            }
        }
        Collections.sort(mediumBalloonCount);
        Collections.sort(largeBalloonCount);
        Collections.reverse(mediumBalloonCount);
        Collections.reverse(largeBalloonCount);
        for (int mask = 0; mask < 1 << n; ++mask) {
            int sumMedium = 0, sumLarge = 0, c1 = 0, c2 = 0;
            int cur = 0;
            for (int i = n - 1; i >= 0; --i) {
                if ((mask & (1 << i)) == 0) {
                    sumMedium += maxAccepted[i];
                    cur += Math.max(0, maxAccepted[i] - (c1 < mediumBalloonCount.size() ? mediumBalloonCount.get(c1) : 0));
                    c1++;
                } else {
                    sumLarge += maxAccepted[i];
                    cur += Math.max(0, maxAccepted[i] - (c2 < largeBalloonCount.size() ? largeBalloonCount.get(c2) : 0));
                    c2++;
                }
            }
            if (sumMedium <= totalMedium && sumLarge <= totalLarge) {
                ans = Math.min(ans, cur);
            }
        }
        return ans == 1000000000 ? -1 : ans;
    }
}