import java.util.*;

public class CheatCode {
    public int[] matches(String keyPresses, String[] codes) {

        ArrayList<Integer> result = new ArrayList<Integer>(codes.length);
        int c = 0;
        boolean found;
        for (String code : codes) {
            found = match(keyPresses, code);
            if (found)
                result.add(c);
            c++;
        }

        c = 0;
        int[] r = new int[result.size()];
        for (Integer in : result) {
            r[c++] = in;
        }

        return r;
    }

    private boolean match(String keyPresses, String code) {
        int j, pos = 0;
        boolean start;
        boolean found;
        char p;
        char s;
        char d;
        j = 0;
        start = false;
        found = true;
        p = ' ';
        for (int i = 0; i < code.length(); i++) {
            if (j == keyPresses.length()) {
                found = false;
                break;
            }
            s = code.charAt(i);
            d = keyPresses.charAt(j);
            if (s == d) {
                j++;
                p = s;
                if (!start)
                    pos = j;
                start = true;
            } else if (!start && s != d) {
                j++;
                i--;
            } else if (start && p == d) {
                i--;
                j++;
            } else { // start && s != d
                found = false;
                break;
            }
        }
        if (!found && (pos + code.length() < keyPresses.length()))
            return match(keyPresses.substring(pos + 1), code);
        return found;
    }
}
