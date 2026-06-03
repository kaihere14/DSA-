class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int finalArray[] = new int[m+n];
        int nums1Pointer = 0;
        int nums2Pointer = 0;
        int counter = 0;
        for(int i =0;i<nums1.length;i++){
            if(nums1Pointer==m)break;
            if(nums2Pointer==n)break;
            if(nums1[nums1Pointer]<=nums2[nums2Pointer]){
                finalArray[counter++]=nums1[nums1Pointer++];
            }else{
                finalArray[counter++]=nums2[nums2Pointer++];
            }
        }
        while(nums2Pointer<n){
            finalArray[counter++]=nums2[nums2Pointer++];
        }
        while(nums1Pointer<m){
            finalArray[counter++]=nums1[nums1Pointer++];
        }
        for(int i = 0 ;i<nums1.length;i++){
            nums1[i]=finalArray[i];
        }
    }
}