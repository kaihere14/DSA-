class Solution {
    public boolean isPossible(int k, int[] arr1, int[] arr2) {
        // Your code goes here.
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int start =0;
        int end =arr2.length-1;
        while(start<=end){
            int temp =arr2[start];
            arr2[start]=arr2[end];
            arr2[end]=temp;
            start++;end--;
        }
        
    
        for(int l=0;l<arr1.length;l++){
            if(arr1[l]+arr2[l]<k){
               return false;
            }
        }return true;
    }
}