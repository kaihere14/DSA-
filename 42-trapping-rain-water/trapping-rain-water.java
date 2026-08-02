class Solution {
    public int trap(int[] height) {
        int total_water = 0;
        int left_max = 0;
        int left_pointer = 0;

        int right_max = height.length-1;
        int right_pointer = height.length-1;

        while(left_max<right_max){
            if(height[left_max]<=height[right_max]){

                if(height[left_max]<=height[left_pointer]){
                    left_max = left_pointer;
                }else{
                    total_water += (height[left_max]-height[left_pointer]);
                }  
                left_pointer++;
            }else{
                if(height[right_max]<=height[right_pointer]){
                    right_max = right_pointer;
                }else{
                    total_water += (height[right_max]-height[right_pointer]);
                }
                right_pointer--;
            }
        }

        return total_water;
    }
}