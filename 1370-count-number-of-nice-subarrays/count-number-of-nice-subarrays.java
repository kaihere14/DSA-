class Solution {

    public int countSubarrayLessThanEqualTarget(int[] nums , int goal){
        int left_pointer = 0;
        int right_pointer = 0;

        int count = 0;
        int curr_sum = 0;

        while(right_pointer<nums.length){
            if(nums[right_pointer]%2!=0){
                curr_sum = curr_sum+1;
            }
            
            while(left_pointer<=right_pointer && curr_sum>goal){
               if(nums[left_pointer]%2!=0){
                 curr_sum = curr_sum-1;
               }
                left_pointer++;
            }

            count = count+(right_pointer-left_pointer+1);
            right_pointer++;
        }
        return count;
    }


    public int numberOfSubarrays(int[] nums, int k) {
        int count = this.countSubarrayLessThanEqualTarget(nums,k);
        int prev = this.countSubarrayLessThanEqualTarget(nums,k-1);
        return count-prev;
    }
}