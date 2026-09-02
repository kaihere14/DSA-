class Solution {
    public boolean uniformArray(int[] nums1) {
        ArrayList<Integer> nums2 = new ArrayList<Integer>(); //for even
        ArrayList<Integer> nums3 = new ArrayList<Integer>(); //for odd
        for(int i = 0 ; i < nums1.length ; i++ ){
            if(nums1[i]%2==0)nums2.add(nums1[i]);
            else nums2.add(nums1[i]);
        }
        
        return true;
    }
}