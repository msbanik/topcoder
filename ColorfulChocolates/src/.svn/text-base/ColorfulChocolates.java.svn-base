import java.util.*;

public class ColorfulChocolates {
    public static int maximumSpread(String C, int maxSwaps) {
        int best = 0;
        for (int i = 0; i < C.length(); i++) {       // i is the original position of the leftmost element in the 'spread'
            for (int j = 0; j < C.length(); j++) {   // j is the final position of the leftmost element in the 'spread'
                int cost = 0, spread = 0;
                char color = C.charAt(i);
                int k = i, l = j;                  // k, l are the original, final positions, respectively, of subsequent elements
                while (k < C.length() && l < C.length()) {
                    // try to move C[k] to C[l] using abs(k-l) swaps
                    if (cost + Math.abs(k - l) > maxSwaps) {
                        break;
                    }
                    spread++;
                    cost += Math.abs(k - l);

                    // make k the next position with the same color
                    k += 1;
                    while (k < C.length() && C.charAt(k) != color)
                        k++;

                    // the next C[l] is just the next position
                    l += 1;
                }
                best = Math.max(best, spread);
            }
        }
        return best;
    }
}