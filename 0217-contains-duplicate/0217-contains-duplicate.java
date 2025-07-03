class Solution {
    public boolean containsDuplicate(int[] nums) {
       Arrays.sort(nums); // Step 1: Sort the array

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true; // Found a duplicate
            }
        }

        return false; // No duplicates foun
        
    }
}