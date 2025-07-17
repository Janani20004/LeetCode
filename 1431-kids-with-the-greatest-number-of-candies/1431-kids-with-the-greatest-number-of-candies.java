class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        int max=0;
        for(int ch:candies){
            if(ch>max){
                max=ch;
            }
        }
        for(int i=0;i<candies.length;i++){
           list.add(candies[i]+extraCandies >=max);
        }
        return list;
        
    }
}