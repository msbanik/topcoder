import java.util.*;

public class UndoHistory {
    public int minPresses(String[] lines) {
        int stk = 0, num, len;
        ArrayList<String> hist = new ArrayList<String>();
        hist.add("");
        String prev = "";
        for (String line : lines) {
            len = line.length();

            // if prev then don't check hist
            if (line.startsWith(prev)) {
                num = prev.length();
            } else {
                num = checkHist(line, hist);
                //mouse
                stk += 2;
            }
            //remaining
            stk += (len - num);

            if (num != len) {
                addtoHist(line, num, hist);
            }

            prev = line;
            //enter
            stk++;
        }
        return stk;
    }

    public void addtoHist(String line, int num, ArrayList<String> hist) {
        int i;
        for (i = num + 1; i < line.length(); i++) {
            hist.add(line.substring(0, i));
        }
    }

    public int checkHist(String line, ArrayList<String> hist) {
        int num = line.length();
        while (num > 0) {
            if (hist.contains(line.substring(0, num))) {
                return num;
            }
            num--;
        }
        return 0;
    }
}
