class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer,Integer> counter = new HashMap<>();
        int left_pointer = 0;
        
        for(int i = 0 ; i <= nums.length-k ; i++ ){
            Set<Integer> sub_counter = new HashSet<>();
            for(int j = i ; j < i + k ; j++ ){
                sub_counter.add(nums[j]);
            }
            for (int num : sub_counter) {
                counter.put(num, counter.getOrDefault(num, 0) + 1);
            }
        }
        int ans = -1;
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
            if(entry.getValue() == 1){
                ans = Math.max(entry.getKey(),ans);
            }
        }
        return ans;
    }
}