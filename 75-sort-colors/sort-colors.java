class Solution {
    public static void sortColors(int[] nums) {
        int startPointer = 0;
        for(int i  = 0 ;i<nums.length;i++){
            if(nums[i]==0){
                int temp = nums[startPointer];
                nums[startPointer]=nums[i];
                nums[i]=temp;
                startPointer++;
            }
        }

        for(int i  = startPointer ;i<nums.length;i++){
            if(nums[i]==1){
                int temp = nums[startPointer];
                nums[startPointer]=nums[i];
                nums[i]=temp;
                startPointer++;
            }
        }
    }
}