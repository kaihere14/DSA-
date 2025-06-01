// User function Template for Java

class Solution {
    public int findStepKeyIndex(int[] arr, int k, int x) {
        // code here
        int start =0;
        while(start<arr.length){
            if(arr[start]==x){
                return start;
            }start++;
        }return -1;
    }
}