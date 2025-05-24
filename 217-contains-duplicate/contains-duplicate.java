class Solution {
   public boolean containsDuplicate(int[] nums) {
     Arrays.sort(nums);
        boolean a = false;
        for (int i =0;i<nums.length-1;i++){
             if(nums[i] == nums[i+1]){
                //will convert boolen into false 
                a = true;
                return a;
             }
        }
        return a;
    }
}