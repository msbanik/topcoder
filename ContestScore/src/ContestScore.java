import java.util.*;

public class ContestScore {
    public String[] sortResults(String[] data) {

        String[] items;
        int i, j, gcount = data.length, jcount;
        String[] gname = new String[gcount];

        jcount = data[0].split(" ").length - 1;
        ArrayList[] temp = new ArrayList[jcount];
        for (j = 0; j < jcount; j++) {
            temp[j] = new ArrayList<Node>(gcount);
        }

        int k = 1;
        for (String line : data) {
            items = line.split(" ");
            gname[k - 1] = items[0];
            for (j = 1; j <= jcount; j++) {
                temp[j - 1].add(new Node(k, Float.parseFloat(items[j])));
            }
            k++;
        }

        int[][] rank = new int[gcount][jcount];

        for (j = 0; j < jcount; j++) {
            Collections.sort(temp[j], new Comparator() {
                public int compare(Object o, Object o2) {
                    return ((Node) o).score.compareTo(((Node) o2).score);
                }
            });
        }

        int sumR = 0;
        float sumS = 0;
        ArrayList<Node> f = new ArrayList<Node>(gcount);
        Node node;
        for (i = 0; i < gcount; i++) {
            for (j = 0; j < jcount; j++) {
                sumR += ((Node) temp[j].get(i)).g;
                sumS += ((Node) temp[j].get(i)).score;
            }
            node = new Node(sumR, sumS);
            node.setName(gname[i]);
            f.add(node);
            sumR = 0;
            sumS = 0;
        }

        Collections.sort(f, new Comparator<Node>() {
            @Override
            public int compare(Node node, Node node2) {
                if (node.g != node2.g)
                    return node.g - node2.g;
                else if (node.score.compareTo(node2.score) != 0)
                    return node.score.compareTo(node2.score);
                else return node.name.compareTo(node2.name);
            }
        });

        String[] result = new String[gcount];
        i = 0;
        for (Node n : f) {
            result[i++] = n.toString();
        }

        return result;
    }

    class Node {
        String name;
        int g;
        Float score;

        public Node(int g, float score) {
            this.g = g;
            this.score = score;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String toString() {
            return name + " " + g + " " + score;
        }
    }
}
