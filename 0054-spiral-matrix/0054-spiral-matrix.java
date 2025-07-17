class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int rowstart=0;
        int rowend=matrix.length;
        int colstart=0;
        int colend=matrix[0].length;
        while(rowstart<rowend&&colstart<colend){
        for(int i=colstart;i<colend;i++){
            ans.add(matrix[rowstart][i]);
        }
        rowstart +=1;
        for(int i=rowstart;i<rowend;i++){
            ans.add(matrix[i][colend-1]);
        }
        colend-=1;
        if(rowstart<rowend){
            for(int i=colend-1;i>=colstart;i--){
                ans.add(matrix[rowend-1][i]);
            }
            rowend-=1;
        }
        if(colstart<colend){
            for(int i =rowend-1;i>=rowstart;i--){
                ans.add(matrix[i][colstart]);
            }
            colstart+=1;
        }
        }
        return ans;
        
    }
}