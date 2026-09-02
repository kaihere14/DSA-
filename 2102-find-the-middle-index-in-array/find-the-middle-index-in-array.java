class Solution {
    public int leftSum(int[] nums,int currIndex){
        int sum = 0 ;
        for(int i = 0 ; i< currIndex ;i++){
            sum += nums[i];
        }
        return sum;
    }
    public int rightSum(int[] nums,int currIndex){
        int sum = 0;
        for(int i = nums.length-1 ; i>currIndex ;i--){
            sum += nums[i];
        }
        return sum;
    }
    public int findMiddleIndex(int[] nums) {
        
        for(int i = 0 ; i < nums.length ; i++ ){
            if(leftSum(nums,i)==rightSum(nums,i)){
                return i;
            }
        }
        return -1;
    }
}