import java.util.*;

public class RouteIntersection {
    public String isValid(int N, int[] coords, String moves) {

        int len = coords.length;
        Map<Integer, Character> map = new HashMap<Integer, Character>();
        for (int i = 0; i < len; i++) {
            map.clear();
            map.put(coords[i], moves.charAt(i));
            for (int j = i + 1; j < len; j++) {
                Character character = map.get(coords[j]);
                if ((character == null) || character == (moves.charAt(j))) {
                    map.put(coords[j], moves.charAt(j));
                } else {
                    map.remove(coords[j]);
                }
                if (map.isEmpty()) {
                    return "NOT VALID";
                }
            }
        }

        return "VALID";
    }
}
