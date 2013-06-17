import java.util.*;

public class PastingPaintingDivTwo {
    public long countColors(String[] clipboard, int T) {
        int width = clipboard[0].length();
        int height = clipboard.length;
        int topF = 0;
        int topS = 0;
        int rest = 0;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || j == 0) {
                    if (clipboard[j].charAt(i) == 'B') {
                        topF++;
                    } else if (((j == 0 && i < width - 1) || (i == 0 && j < height - 1)) && clipboard[j + 1].charAt(i + 1) == 'B') {
                        topS++;
                    }
                } else if (clipboard[j].charAt(i) == 'B') {
                    rest++;
                } else if (((i < width - 1) && (j < height - 1)) && clipboard[j + 1].charAt(i + 1) == 'B') {
                    rest++;
                }
            }
        }
        return topF + (T - 1) * (topF + topS) + rest;
    }
}
