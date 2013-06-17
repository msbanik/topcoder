import java.util.*;

public class RollingDiceDivTwo {
    public int minimumFaces(String[] rolls) {
        int[][] ints = new int[rolls.length][rolls[0].length()];
        for (int i = 0; i < rolls.length; i++) {
            String roll = rolls[i];
            for (int j = 0; j < roll.length(); j++) {
                ints[i][j] = roll.charAt(j) - '0';
            }
        }

        int[] max = new int[rolls[0].length()];
        for (int i = 0; i < ints.length; i++) {
            int[] anInt = ints[i];
            Arrays.sort(anInt);
            for (int j = 0; j < anInt.length; j++) {
                int i1 = anInt[j];
                max[j] = Math.max(max[j], i1);
            }
        }

        int sum = 0;
        for (int i = 0; i < max.length; i++) {
            sum += max[i];

        }
        return sum;
    }
}
