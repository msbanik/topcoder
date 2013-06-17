import java.util.*;

public class TheDeviceDiv2 {
    public String identify(String[] plates) {
        //go to the length
        boolean[] flags = new boolean[3];
        for (int i = 0; i < plates[0].length(); i++) {
            //each plate
            Arrays.fill(flags, false);
            for (int j = 0; j < plates.length; j++) {
                char elem = plates[j].charAt(i);
                if (elem == '0') {
                    flags[0] = true;
                } else if (elem == '1' && !flags[1]) {
                    flags[1] = true;
                } else if (elem == '1' && !flags[2]) {
                    flags[2] = true;
                }

                if (flags[0] && flags[1] && flags[2]) {
                    break;
                }
            }
            if (!(flags[0] && flags[1] && flags[2])) {
                return "NO";
            }
        }
        return "YES";
    }
}
