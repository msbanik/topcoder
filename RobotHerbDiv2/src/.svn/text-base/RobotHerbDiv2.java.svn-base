import java.util.*;

public class RobotHerbDiv2 {
    public int getdist(int T, int[] a) {
        int x = 0, y = 0, dir = 0;
        //T times
        for (int i = 0; i < T; i++) {
            //program
            for (int j = 0; j < a.length; j++) {
                int i1 = a[j];
                switch (dir) {
                    case 0:
                        y += i1;
                        break;
                    case 1:
                        x += i1;
                        break;
                    case 2:
                        y -= i1;
                        break;
                    case 3:
                        x -= i1;
                        break;
                }
                dir += i1;
                dir %= 4;
            }
        }
        return Math.abs(x) + Math.abs(y);
    }
}
