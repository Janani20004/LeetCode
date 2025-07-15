class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int pri=0;
        int sec=0;
        for (int i = 0; i <n ; i++) {
            pri+=mat[i][i];
            sec+=mat[i][n-1-i];

        }
        int Diagonalsum= pri+sec;
        if(n%2==1){
            Diagonalsum-=mat[n/2][n/2];
        }
        
        return Diagonalsum;

        
    }
}