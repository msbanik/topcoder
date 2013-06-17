import java.util.*;

public class InternetSecurity {
    public String[] determineWebsite(String[] address, String[] keyword, String[] dangerous, int threshold) {
        Set<String> danList = new HashSet<String>(Arrays.asList(dangerous));
        int count;
        Set<Integer> results = new HashSet<Integer>();
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < keyword.length; i++) {
                String s = keyword[i];
                String[] split = s.split(" ");
                count = 0;
                for (String s1 : split) {
                    if (danList.contains(s1)) {
                        count++;
                        if (count == threshold) {
                            danList.addAll(Arrays.asList(split));
                            keyword[i] = "";
                            results.add(i);
                            flag = true;
                            break;
                        }
                    }
                }
            }
        }
        ArrayList<Integer> integers = new ArrayList<Integer>(results);
        Collections.sort(integers);
        String[] strings = new String[integers.size()];
        int i = 0;
        for (Integer integer : integers) {
            strings[i] = address[integer];
            i++;
        }
        return strings;
    }
}
