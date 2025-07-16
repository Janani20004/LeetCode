class Solution {
    public int largestAltitude(int[] gain) {
        int peak=0,adder=0;
        for(int i=0;i<gain.length;i++){
            adder=adder+gain[i];
            if(peak<adder){
                peak=adder;
            }
        }
        return peak;
    }
}