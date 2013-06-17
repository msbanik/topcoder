import java.util.*;

public class SpaceWarDiv2 {
    public int minimalFatigue(int[] magicalGirlStrength, int[] enemyStrength, int[] enemyCount) {
        int len = magicalGirlStrength.length;
        ArrayList<Node> nodes = new ArrayList<Node>(len);
        for (int i = 0; i < len; i++) {
            nodes.add(new Node(enemyStrength[i], enemyCount[i]));
        }
        Collections.sort(nodes, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.a > o2.a ? 1 : o1.a == o2.b ? 0 : -1;
            }
        });
        Arrays.sort(magicalGirlStrength);

        boolean flag;
        int[] fat = new int[len];
        for (int f = 1; f < 1000; f++) {
            Arrays.fill(fat, f);
            ArrayList<Node> nodes1 = new ArrayList<Node>(len);
            Collections.copy(nodes1, nodes);
            flag = true;
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    Node node = nodes1.get(j);
                    if (node.b > 0 && magicalGirlStrength[i] >= node.a && fat[i] > 0) {
                        if (fat[i] >= node.b) {
                            fat[i] -= node.b;
                            node.b = 0;
                        } else {
                            node.b = node.b - fat[i];
                            fat[i] = 0;
                        }
                    }
                }
            }
            for (Node node : nodes1) {
                if (node.b > 0) {
                    flag = false;
                }
            }
            if (flag) {
                return f;
            }
        }


        return -1;
    }
}

class Node {
    int a;
    int b;

    Node(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
