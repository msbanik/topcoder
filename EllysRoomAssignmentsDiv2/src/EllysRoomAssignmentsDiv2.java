import java.util.*;

public class EllysRoomAssignmentsDiv2 {
    public double getProbability(String[] ratings) {
        String[] lines;
        StringBuilder sb = new StringBuilder(ratings.length * 13);
        for (String line : ratings) {
            sb.append(line);
        }

        lines = sb.toString().split(" ");
        int N = lines.length;
        int[] list = new int[N];
        int j = 0;
        for (String w : lines) {
            list[j] = Integer.parseInt(w);
            j++;
        }

        if (N <= 20)
            return 1.0;

        int R = N / 20;
        if (N % 20 != 0) {
            R++;
        }

        int elly_rating = list[0];
        int rank = 1;

        for (int i : list) {
            if (i > elly_rating) {
                rank++;
            }

            if (rank > R) {
                return (double) 1 / R;
            }
        }

        if (rank == 1)
            return 1.0;

        return 0.0;
    }
}
