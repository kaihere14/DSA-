class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int maxCount =0;
        int count = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
            if(maxCount<count){
                    maxCount=count;
            }
            if(arr[i]==0){
                count=0;
            }
        }
        return maxCount;
    }
}