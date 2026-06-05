class Solution {
    public static int findDuplicate(int[] nums) {
        int ans  = 0;

        Set<Integer> dup = new HashSet<>();
        for(int i  = 0 ; i<nums.length;i++){
            boolean check = dup.add(nums[i]);
            if(!check){
                return nums[i];
            }
        }
        return ans;
    }
}