public class Data {
    public static final int MAX = 500; // THIS VALUE ADDED TO ENABLE TESTING
    private int[][] grid;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public Data(int[][] g) {
        grid = g;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public int[][] getGrid() {
        return grid;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public void setGrid(int[][] newGrid) {
        grid = newGrid;
    }

    public void repopulate() {
        boolean valid = false;
        int temp = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int x = 0; x < grid[0].length; x++) {
                valid = false;
                while (!valid) {
                    temp = (int) (Math.random() * MAX) + 1;
                    if (temp % 10 == 0 && temp % 100 != 0) {
                        valid = true;
                    }
                }
                grid[i][x] = temp;
            }
        }
    }

    public int countIncreasingCols() {
        int temp = 0;
        boolean allIncrease = true;
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i < cols; i++) {
            allIncrease = true;
            for (int x = rows - 1; x > 0; x--) {
                if (grid[x][i] < grid[x-1][i]) {
                    allIncrease = false;
                }
            }
            if (allIncrease) {
                temp++;
            }
        }
        return temp;
    }
}
