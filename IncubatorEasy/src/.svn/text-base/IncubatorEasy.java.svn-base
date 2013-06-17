public class IncubatorEasy {

    boolean v[];

    boolean getLove(String[] love, int i, int j) {
        if (love[i].charAt(j) == 'Y')
            return true;
        return false;
    }

    void search(String[] love, int idx) {
        for (int i = 0; i < love.length; ++i) {
            if (getLove(love, idx, i) && !v[i]) {
                v[i] = true;
                search(love, i);
            }
        }
    }

    public int maxMagicalGirls(String[] love) {
        int n = love.length;
        int max = 0;
        for (int mask = 0; mask < 1 << n; ++mask) {
            v = new boolean[n];
            for (int j = 0; j < n; ++j) {
                if (((1 << j) & mask) != 0) {
                    search(love, j);
                }
            }
            int t = 0;
            for (int j = 0; j < n; ++j) {
                if (!v[j] && ((1 << j) & mask) != 0)
                    t++;
            }
            max = Math.max(t, max);
        }
        return max;
    }
}