import java.util.*;

public class LeftOrRight {
    int max = 0;

    public int maxDistance(String program) {
        m(program, 0);
        return max;
    }

    void m(String program, int reach) {
        for (int i = 0; i < program.length(); i++) {
            if (program.charAt(i) == 'L') {
                reach--;
            } else if (program.charAt(i) == 'R') {
                reach++;
            } else {
                m("L" + program.substring(i + 1), reach);
                m("R" + program.substring(i + 1), reach);
                break;
            }
            max = Math.max(max, Math.abs(reach));
        }
    }
}
