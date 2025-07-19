class Solution {
    public int minCostToMoveChips(int[] position) {
        int n =position.length;
        int count=0;
        int count1=0;
        for(int i=0;i<n;i++){
            if(position[i]%2==0){
                count++;
            }else{
                count1++;
            }
        }
        int res = Math.min(count,count1);
        return res;
        
    }
}