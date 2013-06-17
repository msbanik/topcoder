import java.util.*;

public class BlackAndWhiteSolitaire {
    public int minimumTurns(String cardFront) {
        char[] cards = cardFront.toCharArray();
        int pair = cards.length / 2;
        int count = 0;
        int count1 = 0;

        for (int i = 0; i < 2 * pair; i += 2) {
            if (!(cards[i] == 'W' && cards[i + 1] == 'B')) {
                if (cards[i] == 'B' && cards[i + 1] == 'W') {
                    count += 2;
                } else
                    count++;
            }
            if (!(cards[i] == 'B' && cards[i + 1] == 'W')) {
                if (cards[i] == 'W' && cards[i + 1] == 'B') {
                    count1 += 2;
                }
                count1++;
            }

        }

        return Math.min(count, count1);
    }
}
