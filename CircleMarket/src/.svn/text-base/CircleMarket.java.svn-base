import java.util.*;

public class CircleMarket {
    public int makePurchases(int[] openTime, int[] closeTime, int travelTime) {
        int count = 0, len = openTime.length;
        boolean flag;
        boolean[] visited = new boolean[len];
        int time = 0;
        while (true) {
            flag = false;
            for (int i = 0; i < len; i++) {
                if (!visited[i] && time >= openTime[i] && time <= closeTime[i]) {
                    count++;
                    visited[i] = true;
                } else if (time < closeTime[i]) {
                    flag = true;
                }
                time += travelTime;
            }
            if (!flag) {
                break;
            }
        }
        return count;
    }
}
