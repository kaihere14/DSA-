class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            int currElement = nums1[i];
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == currElement) {
                    int start = j;
                    while(start<nums2.length &&  nums2[start]<=currElement){
                        start++;
                    }
                    if(start>=nums2.length){
                        nums1[i] = -1;
                        break;
                    }else{
                        nums1[i] = nums2[start];
                        break;
                    }
                   
                } else {
                    nums1[i] = -1;
                }
            }
        }
        return nums1;
    }
}