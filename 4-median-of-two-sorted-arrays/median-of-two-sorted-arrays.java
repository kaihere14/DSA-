class Solution {
    public  double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int f_start = 0;
        int s_start =  0;
        int [] merge = new int[(nums1.length+nums2.length)];
        int start  = 0;
        while(f_start< nums1.length && s_start<nums2.length){
            if(nums1[f_start]<=nums2[s_start]){

                merge[start] = nums1[f_start];
                start++;
                f_start++;
            }else{

                merge[start] = nums2[s_start];
                start++;
                s_start++;
            }
        }
        if(f_start>=nums1.length){
            for(int i = s_start ;i<nums2.length;i++){
                merge[start++] = nums2[i];
            }
        }

        if(s_start>=nums2.length){
            for(int i = f_start ;i<nums1.length;i++){
                merge[start++] = nums1[i];
            }
        }
        
        double ans = 0;
        if(merge.length%2 != 0){
            int mid = merge.length/2;
            System.out.println("mid " + mid);
            ans = merge[mid];
        }else{
            int mid =  merge.length/2;
            ans = (merge[mid]+merge[mid-1])/2.0;
        }
        return ans;
    }
}