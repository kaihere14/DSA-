class Solution {
    public void nextPermutation(int[] arr) {
         int pivot = -1;
        for(int i = arr.length-1; i>0;i-- ){
            if(arr[i]>arr[i-1]){
                pivot = i-1;
                break;
            }
        }
        if(pivot>=0){
            for(int i = arr.length-1;i>pivot;i--){
            if(arr[i]>arr[pivot]){
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot]= temp;
                break;
            }
        }
        int last = arr.length-1;
        for(int i = pivot+1;i<arr.length-1;i++){
            if(i <last){
                int temp =arr[i];
                arr[i]= arr[last];
                arr[last]= temp;
                last--;
            }
        }
        }else{
            int last = arr.length-1;
        for(int i = 0;i<arr.length-1;i++){
            if(i <last){
                int temp =arr[i];
                arr[i]= arr[last];
                arr[last]= temp;
                last--;
            }
        }
        }
    }
}