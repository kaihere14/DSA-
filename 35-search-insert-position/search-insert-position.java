class Solution {
    public int searchInsert(int[] nums, int target) {
        int start =0;
        int c=0;
        int end = nums.length-1;
        while(start<=end){
        int mid = start+(end-start)/2;
        if(target<nums[mid]){
        end = mid -1;
        }else if (target >nums[mid]){
            start  = mid+1;
        }else if(target == nums[mid]){
            return mid;
        }
        if (target==nums[mid]+1){
         c=mid+1;
        }
         if(target == nums[mid]-1){
            c =  mid-1;
        }
        
     }return start;
}
}