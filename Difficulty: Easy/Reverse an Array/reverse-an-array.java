class Solution {
    public void reverseArray(int arr[]) {
        int n;
        int mid = arr.length/2;
        for(int i =0;i<mid;i++) {
            n = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length-1-i] = n;
        }
    }
}