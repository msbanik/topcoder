import java.util.*;

public class PaternityTest {
    public int[] possibleFathers(String child, String mother, String[] men) {

        boolean[] mc = match(mother, child);
        ArrayList<Integer> list = new ArrayList<Integer>();

        int i = 0;
        for (String father : men) {
            boolean[] fc = match(father, child);
            if (count(fc) >= (child.length() / 2)) {
                if (crossMatch(mc, fc))
                    list.add(i);
            }
            i++;
        }

        int[] result = new int[list.size()];
        i = 0;
        for (Integer in : list) {
            result[i++] = in;
        }
        return result;
    }

    public boolean crossMatch(boolean[] mc, boolean[] fc) {
        for (int i = 0; i < mc.length; i++) {
            if (!mc[i] && !fc[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean[] match(String src, String dest) {
        boolean[] sd = new boolean[src.length()];
        for (int i = 0; i < src.length(); i++) {
            sd[i] = src.charAt(i) == dest.charAt(i);
        }
        return sd;
    }

    public int count(boolean[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i]) {
                sum++;
            }
        }
        return sum;
    }
}
