public class CellMain {
    public static Cell[][] nextGeneration(Cell[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Cell[][] next = new Cell[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < cols; column++) {
                Cell cell = grid[row][column];
                int neighbors = LiveLogic.countAliveNeighbors(grid, row, column);

                boolean nextState = cell.computeNextStep(neighbors);

                next[row][column] = new Cell(row, column, nextState);
            }
        }

        return next;
    }
}
