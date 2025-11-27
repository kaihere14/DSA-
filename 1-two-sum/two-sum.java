class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> preNums = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            int req = target-arr[i];
            if(preNums.containsValue(req)){
                for (Map.Entry<Integer, Integer> entry : preNums.entrySet()) {
                    if (entry.getValue().equals(req)) {
                        return new int[]{entry.getKey(),i};
                    }
                }
            }
                preNums.put(i,arr[i]);

        }
        return new int[]{-1,-1};
    }
}