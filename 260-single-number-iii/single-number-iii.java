class Solution {
    public static int[] singleNumber(int[] nums) {
        int ans[] = {0,0};
        Arrays.sort(nums);
        int start = 0;
        for(int i = 1 ;i<nums.length;i++){
            if(nums[i]!=nums[i-1] && i != nums.length-1){
                ans[start++]= nums[i-1];
            }else{
                i++;
            }
        }
        if(start==0){
            ans[start++]=nums[nums.length-2];
        }
        if(start==1){
            ans[start]=nums[nums.length-1];
        }
        return ans;
    }
}