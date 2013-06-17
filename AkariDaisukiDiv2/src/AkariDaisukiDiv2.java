import java.util.*;

public class AkariDaisukiDiv2 {
    public int countTuples(String S) {
        int len = S.length(), count = 0;
        String X, Y;

        for (int we = 1; we <= len - 4; we++) {
            for (int xe = we + 1; xe < len - 3; xe++) {
                X = S.substring(we, xe);


            }
        }

        return count;
    }
}
