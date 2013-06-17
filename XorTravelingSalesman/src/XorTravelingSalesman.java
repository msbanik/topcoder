import java.util.*;

public class XorTravelingSalesman {
    public int maxProfit(int[] cityValues, String[] roads) {
        int ret = 0;
        boolean[][] can = new boolean[cityValues.length][1024];
        can[0][cityValues[0]] = true;
        LinkedList<State> q = new LinkedList<State>();
        q.add(new State(0, cityValues[0]));
        while (!q.isEmpty()) {
            State curr = q.removeFirst();
            ret = Math.max(ret, curr.y);
            for (int j = 0; j < roads[curr.x].length(); j++) {
                if (roads[curr.x].charAt(j) == 'Y' && !can[j][curr.y ^ cityValues[j]]) {
                    can[j][curr.y ^ cityValues[j]] = true;
                    q.addLast(new State(j, curr.y ^ cityValues[j]));
                }
            }
        }
        return ret;
    }

    static class State {
        public int x, y;

        public State(int a, int b) {
            x = a;
            y = b;
        }
    }


}