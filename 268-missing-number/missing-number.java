class Solution {
    public int missingNumber(int[] nums) {
        boolean found = false;
       for(int i =0;i<= nums.length;i++){
           for(int j =0;j<nums.length;j++){
               if(i ==nums[j]){
                   found=true;
               }
           }
           if(!found){
               return i;
           }
           found=false;
       }
       return 0;
    }
}