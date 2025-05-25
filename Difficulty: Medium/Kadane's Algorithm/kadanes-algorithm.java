class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int cur = arr[0];
        int max = arr[0];
        for(int i =1;i<arr.length;i++){
            cur = Math.max(arr[i],cur+arr[i]);
            max =Math.max(cur,max);
        }
        return max;
    }
}
