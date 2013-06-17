import java.util.*;

public class TomekPhone {
    public int minKeystrokes(int[] frequencies, int[] keySizes) {
        Arrays.sort(frequencies);
        int ptr = frequencies.length - 1;
        int res = 0;
        outer:
        for (int at = 0; at < 100; ++at) {
            for (int x : keySizes) {
                if (x > at) {
                    res += (at + 1) * frequencies[ptr];
                    --ptr;
                    if (ptr < 0) break outer;
                }
            }
        }
        if (ptr < 0) return res;
        else return -1;

//        ArrayList<Integer> freq = new ArrayList<Integer>();
//        for (int i = 0; i < frequencies.length; i++) {
//            freq.add(frequencies[i]);
//        }
//        Collections.sort(freq);
//        Collections.reverse(freq);
//
//        ArrayList<Integer> sizes = new ArrayList<Integer>();
//        for (int i = 0; i < keySizes.length; i++) {
//            sizes.add(keySizes[i]);
//        }
//
//        int stroke = 1, i = 0, size, j = 0, v;
//        int totalStroke = 0, len = frequencies.length;
//        while (true) {
//            size = sizes.size();
//            j += size;
//            while (i < j && i < len) {
//                totalStroke += freq.get(i) * stroke;
//                i++;
//            }
//
//            if (i == len) {
//                break;
//            }
//
//            for (int k = 0; k < size; k++) {
//                v = sizes.get(k);
//                if (v == 1) {
//                    sizes.remove(k);
//                    k--;
//                    size--;
//                } else {
//                    sizes.set(k, v - 1);
//                }
//            }
//            stroke++;
//            if (sizes.size() == 0 && i < len) {
//                return -1;
//            }
//        }
//
//        return totalStroke;

    }
}
