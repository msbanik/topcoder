import java.util.*;

public class AlternateColors {
    public String getColor(long r, long g, long b, long k) {
        String[] colors = new String[]{"BLUE", "RED", "GREEN"};
        Node[] nodes = new Node[]{new Node("RED", 0, r), new Node("GREEN", 1, g), new Node("BLUE", 2, b)};
        Arrays.sort(nodes);

        if ((k / 3) < nodes[0].value) {
            return colors[(int) k % 3];
        } else {
            k = k - nodes[0].value;
            k = k - nodes[0].value;
            k = k - nodes[0].value;
            if ((k / 2) <= nodes[1].value - nodes[0].value) {
                k %= 2;
                if (nodes[1].color < nodes[2].color) {
                    colors = new String[]{nodes[2].name, nodes[1].name};
                } else {
                    colors = new String[]{nodes[1].name, nodes[2].name};
                }
                return colors[(int) k];
            } else {
                return nodes[2].name;
            }

        }
    }

    class Node implements Comparable<Node> {
        int color;
        long value;
        String name;

        Node(String name, int color, long value) {
            this.name = name;
            this.color = color;
            this.value = value;
        }

        public int compareTo(Node o) {
            return value > o.value ? 1 : o.value == value ? 0 : -1;
        }
    }
}
