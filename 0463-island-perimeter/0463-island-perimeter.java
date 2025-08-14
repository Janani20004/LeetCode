class Solution {
    public int islandPerimeter(int[][] grid) {
        int land = 0;
        int Edges = 0;
         for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    land++;
                    if (j + 1 < grid[i].length && grid[i][j + 1] == 1) {
                        Edges++;
                    }
                    if (i + 1 < grid.length && grid[i + 1][j] == 1) {
                        Edges++;
                    }
                }
            }
        }
        return land * 4 - Edges * 2;
    }
}