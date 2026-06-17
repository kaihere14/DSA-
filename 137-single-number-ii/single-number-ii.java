class Solution {
    public static int singleNumber(int[] nums) {
        int ans  = 0 ;
        HashMap<Integer,Integer> counter = new HashMap<>();
        for(int i = 0 ;i<nums.length;i++){
            if(counter.containsKey(nums[i])){
                int curr = counter.get(nums[i]);
                counter.put(nums[i], curr+1);
            }else{
                counter.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return ans;
    }
}