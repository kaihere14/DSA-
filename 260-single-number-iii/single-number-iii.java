class Solution {
    public static int[] singleNumber(int[] nums) {
        int xor=0;
        if(nums.length==2){
            int ans[]={nums[0],nums[1]};
            return ans;
        }
        for(int i = 0 ;i<nums.length;i++){
            xor = xor^nums[i];
        }
        int right_shift = (xor^(xor-1))&xor;
        int b1=0,b2=0;
        for(int i = 0 ;i<nums.length;i++){
            if((nums[i]&right_shift)>0){
                b1 = b1^nums[i];
            }else{
                b2 = b2^nums[i];
            }
        }
        int ans[] = {b1,b2};
        return ans;
    }
}