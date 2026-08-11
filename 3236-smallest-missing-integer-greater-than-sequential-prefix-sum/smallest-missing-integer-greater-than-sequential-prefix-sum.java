class Solution {
    public int missingInteger(int[] nums) {
        int max_sum = nums[0];
        

        int left_pointer = 0; 
        int pointer = 1 ;

        int found  = 0;


        
        List<Integer> container = new ArrayList();
        
        while(pointer < nums.length ) {
            container.add(nums[pointer-1]);

           if(nums[pointer] == nums[pointer - 1] + 1 && found ==0){
                max_sum = max_sum + nums[pointer];
           }else{
            found = 1;
           }
            pointer++;

        }

        container.add(nums[pointer-1]);


        int ans = -1;
        int curr = 0;
        while(ans==-1){
            if(!container.contains(max_sum+curr)){
                ans = max_sum+curr;
                break;
            }
            curr++;
        }
        
        return ans;
    }
}