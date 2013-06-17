import java.util.*;

public class FoxAndMp3Easy {
    public String[] playList(int n) {
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = String.valueOf(i + 1 + ".mp3");
        }
        Arrays.sort(strings);
        if (strings.length > 50) {
            String[] dest = new String[50];
            System.arraycopy(strings, 0, dest, 0, 50);
            return dest;
        }
        return strings;
    }
}
