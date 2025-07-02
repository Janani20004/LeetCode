class Solution {
    public int[] twoSum(int[] numbers, int target) {
         for (int j = 0; j < numbers.length; j++) {
            for (int i = j + 1; i < numbers.length; i++) {
                if (numbers[j] + numbers[i] == target) {
                    return new int[] { j+1,i+1 };
                }
            }
        }
        return new int[] {};
        
    }
}