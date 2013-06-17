import java.util.*;

public class BoardSplitting {
    public int minimumCuts(int desiredLength, int desiredCount, int actualLength) {
        int cut = 0, pos = 0;
        while (desiredCount > 0) {
            pos += desiredLength;
            if (pos % actualLength != 0) {
                cut++;
            }
            desiredCount--;
        }
        return cut;
    }
}
