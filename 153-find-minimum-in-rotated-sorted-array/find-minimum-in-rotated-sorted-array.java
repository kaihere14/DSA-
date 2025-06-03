class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end =nums.length-1;
        int min = Integer.MAX_VALUE;
        while(start<=end){
            if(min>nums[start]){
                min = nums[start];
            }start++;
        }
        return min;
    }
}