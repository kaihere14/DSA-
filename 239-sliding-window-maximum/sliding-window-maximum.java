class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] ans = new int[nums.length - k + 1];
        int counter = 0;

        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(deque.size()!= 0 && deque.peekFirst()<=(i-k)){
                deque.pop();
            }

            while(deque.size()!= 0 && nums[deque.peekLast()]<=nums[i]){
                deque.removeLast();
            }

            deque.addLast(i);

            if(i>=k-1){
                ans[counter++] = nums[deque.peekFirst()];
            }
        }

        return ans;
    }
}