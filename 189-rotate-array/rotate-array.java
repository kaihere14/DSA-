class Solution {
    public void rotate(int[] arr, int d) {
       d = d % arr.length;
        int temp[] = new int[d];

        for (int i = arr.length - d; i < arr.length; i++) {
            temp[(i+d)-arr.length] = arr[i];
        }
        for(int i = arr.length-d-1;i>=0;i--){
            arr[i+d]=arr[i];
        }
        for(int i =0;i< temp.length;i++){
            arr[i]= temp[i];
        }
    }
}