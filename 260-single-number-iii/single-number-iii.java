class Solution {
    public static int[] singleNumber(int[] nums) {
        int ans[] = {0,0};
        Map<Integer,Integer> counter = new HashMap<>();
        for(int i = 0 ; i<nums.length;i++){
            counter.put(nums[i], counter.getOrDefault(nums[i], 0)+1);
        }
        int start=0;
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
           if(entry.getValue()==1){
             ans[start++]= entry.getKey();
           }
        }
        return ans;
    }
}