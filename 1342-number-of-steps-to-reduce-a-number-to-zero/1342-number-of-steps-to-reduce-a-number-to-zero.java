class Solution {
    public int numberOfSteps(int num) {
        return num(num);
    
    }
     public static int num(int i) {
        if (i == 0) return 0;

        if (i % 2 == 0) {
            return 1 + num(i / 2); 
        } else {
            return 1 + num(i - 1); 
      
      }
    }
}