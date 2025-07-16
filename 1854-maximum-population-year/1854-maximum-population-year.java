class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[101];

        for (int[] log : logs) {
            years[log[0] - 1950]++;
            years[log[1] - 1950]--;
        }

        int maxPop = 0, maxYear = 1950, currPop = 0;
        for (int i = 0; i < years.length; i++) {
            currPop += years[i];
            if (currPop > maxPop) {
                maxPop = currPop;
                maxYear = 1950 + i;
            }
        }

        return maxYear;

        
    }
}