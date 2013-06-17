import java.util.*;

public class ChickenOracle {
    public String theTruth(int n, int eggCount, int lieCount, int liarCount) {
        int totalLie = lieCount + liarCount;
        int chickenCount = n - eggCount;

        if (totalLie < eggCount) {
            return "The egg";
        } else if (totalLie < chickenCount) {
            return "The chicken";
        }



        return null;
    }
}
