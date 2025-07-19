class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int max =0;
        for(int num:nums ){
            if(count==0){
                max=num;
            }
            count+=(num==max)?1:-1;
        }
        return max;

        
    }
}