class Solution {
   public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);  // Sorting helps with duplicate removal

    for (int i = 0; i < nums.length - 2; i++) {
        if (i > 0 && nums[i] == nums[i - 1]) continue;  // Skip duplicates

        for (int j = i + 1; j < nums.length - 1; j++) {
            if (j > i + 1 && nums[j] == nums[j - 1]) continue;  // Skip duplicates

            for (int k = j + 1; k < nums.length; k++) {
                if (k > j + 1 && nums[k] == nums[k - 1]) continue;  // Skip duplicates

                if (nums[i] + nums[j] + nums[k] == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                }
            }
        }
    }

    return result;
}
}