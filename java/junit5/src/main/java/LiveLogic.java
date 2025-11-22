public class LiveLogic {
    private static final int[][] DISTRIBUTIONS = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},           {0, 1},
            {1, -1},  {1, 0},  {1, 1}
    };

    public static int countAliveNeighbors(Cell[][] grid , int row, int col) {
    int count = 0;

    for (int[] d : DISTRIBUTIONS) {
        int x = row + d[0];
        int y = col + d[1];
        if (x >= 0 && x < grid.length &&
                y >= 0 && y < grid[0].length &&
                grid[x][y].isAlive()) {
            count++;
        }
    }
    return count;
    }
}
