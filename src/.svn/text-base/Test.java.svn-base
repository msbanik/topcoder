import java.util.*;

/**
 * User: mbani002 Date: 5/29/13 : 10:43 PM
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("abc".substring(2,3));

//        HashSet<String> set1 = new HashSet<String>();
//        set1.add("a");
//        set1.add("b");
//        set1.add("c");
//        HashSet<String> set2 = new HashSet<String>();
//        set2.add("b");
//
//        boolean b = set1.retainAll(set2);
//
//        printSet(set1);
//        printSet(set2);

//        setTest();
//        System.out.println(Integer.valueOf("101", 2));

//        printBinary();

//        bitMask();
//        bitMaskSimple();


//        int N = 4, M = 6;
//        int total = 0;
//        total = Math.min(N, M);
//
//        int msqrt = (int) Math.sqrt(M);
//        int nsqrt = (int) Math.sqrt(N);
//
//
//
//        for (int i = 1; i <= N; i++) {
//            for (int j = 1; j <= M; j++) {
//                if (i < j) {
//                    System.out.printf("%d, %d \n", i, j);
//                }
//            }
//        }

//        Random random = new Random();
//        Node[] nodes = new Node[10];
//        for (int i = 0; i < 10; i++) {
//            nodes[i] = new Node(i, random.nextInt());
//        }
//        printNodes(nodes);
//
//        Arrays.sort(nodes);

//        Arrays.sort(nodes, new Comparator<Node>() {
//            @Override
//            public int compare(Node o1, Node o2) {
//                return o1.data - o2.data;
//            }
//        });

//        System.out.println("Sorted");
//        printNodes(nodes);

//        System.out.println(reverse(9901));

//        Integer[] integers = divisor(1000);
//        for (Integer integer : integers) {
//            System.out.print(integer + ", ");
//        }

//        boolean[] booleans = seive(100);
//        for (int i = 0; i < booleans.length; i++) {
//            if (booleans[i])
//                System.out.print(i + ",");
//        }
    }

    private static void printSet(HashSet<String> set1) {
        for (String s : set1) {
            System.out.print(s + ", ");
        }
        System.out.println("");
    }

    private static void setTest() {
        Set<Character> chars = new HashSet<Character>();
        chars.add('1');
        chars.add('2');
        chars.add('3');
        String num = "123";
        ArrayList<String> src = new ArrayList<String>();
        src.add("");
        ArrayList<String> dest = new ArrayList<String>();
        for (int i = 0; i < num.length(); i++) {
            for (String string : src) {


            }

        }

    }

    private static void printBinary() {
        for (int i = 0; i < 10; i++) {
            long v = (long) Math.pow(5, i);
            System.out.printf("%10d %s\n", v, Long.toBinaryString(v));
        }
    }

    private static void bitMaskSimple() {
        int n = 4;
        for (int mask = 0; mask < 1 << n; mask++) {
            System.out.println(Integer.toBinaryString(mask));
        }
    }

    private static void bitMask() {
        int n = 6;
        for (int mask = 0; mask < 1 << n; mask++) {
            System.out.printf("\n%d \n", mask);
            for (int i = n - 1; i >= 0; i--) {
                if ((mask & (1 << i)) == 0) {
                    System.out.print("0");
                } else
                    System.out.print("1");
            }

        }
    }

    private static void printNodes(Node[] nodes) {
        for (int i = 0; i < nodes.length; i++) {
            Node node = nodes[i];
            System.out.println(node.index + ", " + node.data);
        }
    }

    static class Node implements Comparable<Node> {
        int index;
        int data;

        Node(int index, int data) {
            this.index = index;
            this.data = data;
        }

        @Override
        public int compareTo(Node o) {
            return (this.data < o.data ? -1 : (this.data == o.data ? 0 : 1));
        }
    }

    private static int reverse(int i) {
        int r = 0;
        while (i != 0) {
            r = (r + (i % 10)) * 10;
            i = i / 10;
        }
        return r / 10;
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }
        int m = (int) Math.sqrt(n);
        for (int i = 3; i <= m; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean[] seive(int n) {
        boolean[] booleans = new boolean[n + 1];
        Arrays.fill(booleans, true);
        booleans[0] = booleans[1] = false;
        int r = (int) Math.sqrt(n);
        for (int i = 2; i <= r; i++) {
            if (booleans[i]) {
                for (int j = i * i; j <= n; j += i) {
                    booleans[j] = false;
                }
            }
        }
        return booleans;
    }

    public static Integer[] divisor(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int m = (int) Math.sqrt(n);
        System.out.println("m = " + m);
        for (int i = 2; i <= m; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        return list.toArray(new Integer[list.size()]);
    }
}
