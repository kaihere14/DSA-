
class Solution {
    public static int countPrimes(int n) {
        

        int count = 0;
        int arr[] = new int[n];
        Arrays.fill(arr, 1);
        
        int start = 2;
        while(start<n){
            int curr = start;
            if(arr[start]==0){
                start++;
                continue;
            };
            int mul =1;
            int value = 0;
            while(value<n){
                if(value!=start){
                    arr[value] = 0;
                }
                value = curr*mul;
                mul++;
            }
            start++;
        }
        for(int i =2;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
        }
        return count;
    }
}