class Solution {
    public int[] runningSum(int[] nums) {
        int prev_sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = nums[i]+prev_sum;
            prev_sum = nums[i];
        }
        return nums;
    }
}