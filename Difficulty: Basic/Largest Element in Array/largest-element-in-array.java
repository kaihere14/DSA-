class Solution {
    public static int largest(int[] arr) {
        
        int i = Integer.MIN_VALUE;
        for(int j = 0;j<arr.length;j++){
            if(arr[j]>i){
                i = arr[j];
            }
        }
        return i;
    }
}
