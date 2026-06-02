class Solution {
    public void sortColors(int[] nums) {
        for(int i = 0 ; i<nums.length;i++){
            int min = nums[i];
            for(int j = i ;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    int temp = nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
    }
}