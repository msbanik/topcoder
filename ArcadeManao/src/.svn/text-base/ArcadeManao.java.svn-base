import java.util.*;

public class ArcadeManao {

    public static int height;
    public static int width;
    public static int L;
    public static boolean[][] visited = new boolean[50][50];
    public static String[] level;

    public int shortestLadder(String[] level, int coinRow, int coinColumn) {
        ArcadeManao.level = level;
        height = level.length;
        width = level[0].length();
        for (L = 0; L < 49; L++) {
            for (boolean[] booleans : visited) {
                Arrays.fill(booleans, false);
            }
            dfs(height - 1, 0);
            if (visited[coinRow - 1][coinColumn - 1]) {
                return L;
            }
        }
        return 49;
    }

    private void dfs(int i, int j) {
        if (visited[i][j]) {
            return;
        }
        visited[i][j] = true;
        //Edge: horizontal move left
        if ((j > 0) && (level[i].charAt(j - 1) == 'X')) {
            dfs(i, j - 1);
        }
        //Edge: horizontal move right
        if ((j < width - 1) && (level[i].charAt(j + 1) == 'X')) {
            dfs(i, j + 1);
        }
        //Edges: vertical moves
        for (int k = 0; k < height; k++) {
            if (Math.abs(k - i) <= L && (level[k].charAt(j) == 'X')) {
                dfs(k, j);
            }
        }
    }
}
