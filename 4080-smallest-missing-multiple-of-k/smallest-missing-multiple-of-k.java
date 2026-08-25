class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer> counter = new ArrayList();
        for(int num:nums){
            counter.add(num);
        }

        for(int i = 1 ; i <=nums.length+1 ; i++){
            if(!counter.contains(k*i)){
                return k*i;
            }
        }
        return -1;
    }
}