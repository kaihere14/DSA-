class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int curr_max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++ ){
            curr_max = Math.max(curr_max,nums[i]);
            int curr_min = Integer.MAX_VALUE;
            for(int j = i ; j < nums.length ; j++){
                curr_min = Math.min(curr_min,nums[j]);
            }
            if(curr_max-curr_min<=k)return i;
        }
        return -1;
    }
}