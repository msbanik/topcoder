import java.util.*;

public class TheBrickTowerMediumDivTwo {
    private List<String> permList = new ArrayList<String>();

    public int[] find(int[] heights) {
        int len = heights.length;
        String numbers = "";
        for (int i = 0; i < len; i++) {
            numbers += i;
        }
        perm(numbers);
        int m, n, mx, sum, max = 0;
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String sample : permList) {
            mx = 0;
            sum = 0;
            for (int i = 0; i < sample.length() - 1; i++) {
                m = sample.charAt(i) - '0';
                n = sample.charAt(i + 1) - '0';
                mx = Math.max(heights[m], heights[n]);
                sum += mx;
            }
            map.put(sample, sum);
            max = Math.max(max, sum);
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            if (next.getValue() != max) {
                entries.remove(next);
            }
        }
        ArrayList strings = new ArrayList(entries);
        Collections.sort(strings);
        String o = (String) strings.get(0);
        int[] ints = new int[o.length()];
        for (int i = 0; i < o.length(); i++) {
            ints[i] = Integer.parseInt(o.charAt(i) + "");
        }
        return ints;
    }

    private void perm(String s) {
        perm1("", s);
    }

    private void perm1(String prefix, String s) {
        int len = s.length();
        if (len == 0) {
            permList.add(prefix);
        }
        for (int i = 0; i < len; i++) {
            perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1));
        }
    }
}
