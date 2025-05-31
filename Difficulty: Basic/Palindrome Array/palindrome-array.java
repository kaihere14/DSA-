
class Solution {
    public static boolean isPerfect(int[] arr) {
        // code here
        int start =0;
        int end =arr.length-1;
        while(start<=end){
            if(arr[end]!=arr[start]){
                return false;
            }start++;end--;
        }
        return true;
    }
}
