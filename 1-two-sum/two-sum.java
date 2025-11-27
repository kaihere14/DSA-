class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> preNums = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            int req = target-arr[i];
            if(preNums.containsKey(req)){
                return new int[]{preNums.get(req),i};
            }
                preNums.put(arr[i],i);

        }
        return new int[]{-1,-1};
    }
}