class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxsum =0;
        int windowsum=0;

        for(int i=0;i<k;i++){
            windowsum+=nums[i];
        }
        maxsum=windowsum;
        for(int i=k;i<nums.length;i++){
            windowsum+=nums[i]-nums[i-k];
            maxsum=Math.max(maxsum,windowsum);
        }
        return (double) maxsum/k;
        
    }
}