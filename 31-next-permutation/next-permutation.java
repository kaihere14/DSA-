class Solution {
    public static void nextPermutation(int[] nums) {
        boolean sort = true;
        int pivotIndex = -1;
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivotIndex=i;
                break;
            }
        }
        if(pivotIndex == -1){
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] < nums[i]) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }

            }
            return;
        }

        for(int i = nums.length-1;i>=0;i--){
            if(nums[i]>nums[pivotIndex]){
                int temp = nums[i]; 
                nums[i]= nums[pivotIndex];
                nums[pivotIndex]=temp;
                break;
            }
        }
        int left = pivotIndex + 1, right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

    }
}

