class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int rowstart=0;
        int rowend=n;
        int colstart=0;
        int colend=n;
        int num=1;

        while(rowstart<rowend&&colstart<colend){
             for(int i=colstart;i<colend;i++){
            matrix[rowstart][i]=num++;
        }
        rowstart++;
        for(int i=rowstart;i<rowend;i++){
            matrix[i][colend-1]=num++;
        }
        colend-=1;
        if(rowstart<rowend){
            for(int i =colend-1;i>=colstart;i--){
                matrix[rowend-1][i]=num++;
            }
        }
        rowend--;
        if(colstart<colend){
            for(int i=rowend-1;i>=rowstart;i--){
                matrix[i][colstart]=num++;
            }
        }
        colstart++;

        }
        return matrix;
    }
}
               