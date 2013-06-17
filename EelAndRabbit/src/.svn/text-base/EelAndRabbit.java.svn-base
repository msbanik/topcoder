import java.util.*;

public class EelAndRabbit {
    public int getmax(int[] l, int[] t) {
        int i = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(t.length);
        for (int j : t) {
            map.put(i++, j);
        }
        map = MapUtil.sortByValue(map);

        int ncatch, time, index, ntime, nindex;
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, Integer>> iterator = entries.iterator();
        if (iterator.hasNext()) {
            Map.Entry<Integer, Integer> min = iterator.next();
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            ncatch = 0;
            index = e.getKey();
            time = e.getValue();
            for (Map.Entry<Integer, Integer> n : map.entrySet()) {
                nindex = n.getKey();
                ntime = n.getValue();
                if (ntime > time)
                    break;

                if (ntime == time) {
                    ncatch++;
                    continue;
                } else if (l[nindex] + ntime >= time)
                    ncatch++;
            }
            System.out.println(ncatch);

        }
        return 0;
    }
}

class MapUtil {
    public static <K, V extends Comparable<? super V>> Map<K, V>
    sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list =
                new LinkedList<Map.Entry<K, V>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        Map<K, V> result = new LinkedHashMap<K, V>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
