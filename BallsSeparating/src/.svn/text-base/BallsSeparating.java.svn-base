import java.util.*;

public class BallsSeparating {
    public int minOperations(int[] red, int[] green, int[] blue) {
        if (red.length < 3) {
            return -1;
        }
        Node[] nodes = new Node[red.length];
        for (int i = 0; i < red.length; i++) {
            nodes[i] = new Node(red[i], green[i], blue[i]);
        }
        int rem = 0;
        for (int i = 0; i < nodes.length; i++) {
            rem += nodes[i].rem;
        }
        return rem;
    }

    class Node {
        int max;
        int rem;

        Node(int r, int g, int b) {
            max = Math.max(Math.max(r, g), b);
            rem = r + g + b - max;
        }
    }
}
