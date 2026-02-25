class Solution {
    public static boolean isValid(int arr[],int max , int curr) {
        int count  = 1;
        int sum =0;
        for(int i  =0;i<arr.length;i++){
            if(arr[i]>curr) return false;
            sum += arr[i];
            if(sum>curr){
                count++;
                sum=arr[i];
            }
            if(count>max) return false;
        }

        return true;
    }

    public  int splitArray(int[] nums, int k) {
        int ans =-1;
        int low = Integer.MAX_VALUE;
        int high = 0;
        for(int i = 0; i<nums.length;i++){
            low = Math.min(nums[i],low);
            high += nums[i];
        }
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isValid(nums,k,mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return ans;
    }
}