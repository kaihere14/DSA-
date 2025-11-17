class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int i = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int j = 0;j<arr.length;j++){
            if(arr[j]>i){
                i = arr[j];
            }
        }

        for (int k =0 ;k< arr.length;k++){
            if(arr[k]<i && arr[k]>second){
                second = arr[k];
            }
        }

        return second;
    }
}