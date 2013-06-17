import java.util.*;

public class Suminator {

    public int findMissing(int[] program, int wantedResult) {
        int pos;
        for (pos = 0; pos < program.length; pos++) {
            if (program[pos] == -1)
                break;
        }

        program[pos] = 0;
        int res = sim(program);
        if (res == wantedResult) {
            return 0;
        }
        program[pos] = 1;
        res = sim(program);

        program[pos] = 2;
        int res2 = sim(program);

        if (res == res2 || wantedResult < res || res < 0) {
            return -1;
        }
        return wantedResult - res + 1;
    }

    private int sim(int[] program) {
        Stack<Integer> stack = new Stack<Integer>();
        int i1, a, b;
        for (int i = 0; i < program.length; i++) {
            i1 = program[i];
            if (i1 == 0) {
                a = 0;
                b = 0;
                if (!stack.isEmpty()) {
                    a = stack.pop();
                }
                if (!stack.isEmpty()) {
                    b = stack.pop();
                }
                stack.push(a + b);
            } else {
                stack.push(i1);
            }
        }
        if (stack.isEmpty()) {
            return 0;
        }
        return stack.pop();
    }
}
