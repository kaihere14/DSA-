class Solution {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        int total_subset = 1<<n;
        for(int i = 0 ;i<total_subset;i++){
            List<Integer> pre_ans = new ArrayList<>();
            for(int j = 0 ;j<n;j++){
                int check = i & (1<<j);
                if(check>0){
                    pre_ans.add(nums[j]);
                }
            }
            ans.add(pre_ans);
        }

        return ans;
    }
}