class Solution {
    public int subarraySum(int[] arr, int k) {
         int sum = 0;
        int count =0;
         Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1); // important

        for (int num : arr) {
            sum += num;

            int pre = sum - k;

            if (map.containsKey(pre)) {
                count += map.get(pre);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}