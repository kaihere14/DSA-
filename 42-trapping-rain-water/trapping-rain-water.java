class Solution {
    public int trap(int[] height) {
        //calculatinf left max
        int left_max[] = new int[
            height.length];
        left_max[0] = height[0];
        //calculating right max
        int right_max[] = new int[height.length];
        right_max[right_max.length - 1] = height[height.length - 1];
        int tw=0;
        for (int i = 1; i < height.length; i++) {
            if (left_max[i - 1] < height[i]) {
                left_max[i] = height[i];
            } else {
                left_max[i] = left_max[i - 1];
            }
        }
        for (int k = height.length-1; k >0 ; k--) {
            if (right_max[k] < height[k-1]) {
                right_max[k-1] = height[k-1];
            } else {
                right_max[k-1]= right_max[k];
            }
        }
        for (int l = 0; l < height.length; l++) {
            int mw = Math.min(left_max[l],right_max[l]);
            tw += (mw-height[l]);
        }
        return tw;
    }
 }