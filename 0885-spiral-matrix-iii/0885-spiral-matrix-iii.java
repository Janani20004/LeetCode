class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][2];
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; 
        int steps = 0, index = 0;
        int d = 0; 

        while (index < rows * cols) {
            if (d == 0 || d == 2) steps++;

            for (int i = 0; i < steps; i++) {
                if (rStart>= 0 && rStart < rows&& cStart >= 0 && cStart< cols) {
                    result[index++] = new int[]{rStart, cStart};
                }
                rStart += directions[d][0];
                cStart+= directions[d][1];
            }
            d = (d + 1) % 4;
        }
        return result;

        
        
    }
}