class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
       int minCount =0;
        int count = 0;
        for(int i =0;i< arr.length;i++){
            if(arr[i]==1){
                count++;
            }else{
                if(minCount<count){
                    minCount=count;
                }
                count=0;
            }
        }
        if(minCount>count){
            return minCount;
        }
        return count;
    }
}