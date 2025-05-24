class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Iterate over each elements
        for (int i = 0; i < nums.length; i++) {
            // Check pairs with elements after i
            for (int j = i + 1; j < nums.length; j++) {
                // If sum matches target, return indices
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // If no pair found (problem guarantees one, so this won't happen)
        return new int[0];
    }
}
