class Solution {
    public void moveZeroes(int[] arr) {
       int k =0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                arr[k]=arr[i];
                k++;
            }
            if(i>=k){
                arr[i]=0;
            }
        }
    }
}