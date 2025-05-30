// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        boolean check = true;
        while(check){
            check =false;
            for(int i =0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    check =true;
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        
        }return arr[k-1];
           
       }
  }

