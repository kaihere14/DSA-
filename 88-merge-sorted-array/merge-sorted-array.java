class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
       int nums1Pointer = m-1;
       int nums2Pointer =n-1;
       int index = m+n-1;
       while(nums1Pointer>=0 && nums2Pointer>=0){
        if(nums1[nums1Pointer]>=nums2[nums2Pointer]){
            nums1[index]=nums1[nums1Pointer];
            index--;nums1Pointer--;
        }else{
            nums1[index]=nums2[nums2Pointer];
            index--;nums2Pointer--;
        }
       }
       while(nums2Pointer>=0){
        nums1[index]=nums2[nums2Pointer];
        index--;nums2Pointer--;
       }
    }
}