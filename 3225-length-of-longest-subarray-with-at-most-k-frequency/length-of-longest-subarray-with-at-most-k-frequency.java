class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> counter = new HashMap<>();
        int left_pointer = 0 ;
        int right_pointer = 0 ;
        int ans = -1;
        while(right_pointer<nums.length){
            int value = counter.getOrDefault(nums[right_pointer], 0);
            counter.put(nums[right_pointer], value + 1);

            while (counter.get(nums[right_pointer]) > k) {
                value = counter.get(nums[left_pointer]);
                counter.put(nums[left_pointer], value - 1);
                left_pointer++;
            }
            
            ans = Math.max(ans,right_pointer-left_pointer+1);
            right_pointer++;
        }
        return ans;
    }
}