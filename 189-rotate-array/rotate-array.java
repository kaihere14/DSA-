class Solution {
    public void rotate(int[] arr, int d) {
       d = d % arr.length;
        int temp[] = new int[d];
        int l = 0;
        for (int i = arr.length - d; i < arr.length; i++) {
            temp[l++] = arr[i];
        }
        for(int i = arr.length-d-1;i>=0;i--){
            arr[i+d]=arr[i];
        }
        for(int i =0;i< temp.length;i++){
            arr[i]= temp[i];
        }
    }
}