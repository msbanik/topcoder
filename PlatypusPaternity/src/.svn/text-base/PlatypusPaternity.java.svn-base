import java.util.*;

public class PlatypusPaternity {

    public int maxFamily(String[] femaleCompatibility, String[] maleCompatibility, String[] siblingGroups) {
        int s = 0, count, max = 0, sib;
        for (String siblingGroup : siblingGroups) {
            count = 0;
            sib = 0;
            for (int i = 0; i < siblingGroup.length(); i++) {
                if (siblingGroup.charAt(i) == 'Y') {
                    if (femaleCompatibility[s].charAt(i) == 'Y' && maleCompatibility[s].charAt(i) == 'Y') {
                        count++;
                    }
                    sib++;
                }
            }
            max = Math.max(max, Math.max(sib, count + 2));
            s++;
        }
        return max;
    }
}
