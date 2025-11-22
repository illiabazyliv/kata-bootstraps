class Cell {
    private final int row;
    private final int col;
    private boolean alive;
    public Cell(int row, int col, boolean alive) {
        this.row = row;
        this.col = col;

    }
    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }
    public boolean isAlive() {
        return alive;
    }
    public void SetAlive(boolean alive) {
        this.alive = alive;
    }
    public boolean computeNextStep(int aliveNeighbours) {
        if (alive) {
            return aliveNeighbours == 2 || aliveNeighbours ==3;
        }
        else{
            return aliveNeighbours == 3;
        }
    }
}