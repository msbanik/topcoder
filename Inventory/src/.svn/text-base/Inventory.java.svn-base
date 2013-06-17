import java.util.*;

public class Inventory {
    public int monthlyOrder(int[] sales, int[] daysAvailable) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] == 0) {
                if (daysAvailable[i] != 0)
                    count++;
                continue;
            } else {
                count++;
                sum += (double) sales[i] * 30 / daysAvailable[i];
            }
        }
        if (count != 0)
            sum = sum / count;

        int intPart = (int) sum;
        if (Math.abs(sum - intPart) < 1E-10) {
            return intPart;
        }
        return intPart + 1;
    }
}
