class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] ans = new int[nums.length - k + 1];
        int ansIdx = 0;

        Deque<Integer> deque = new ArrayDeque<>();

        int curr_max = Integer.MIN_VALUE;
        int curr_index = -1;

        
        for (int i = 0; i < k; i++) {
            deque.addLast(nums[i]);

            if (curr_max <= nums[i]) {
                curr_max = nums[i];
                curr_index = i + 1;
            }
        }

        ans[ansIdx++] = curr_max;
        curr_index--;

        
        for (int i = k; i < nums.length; i++) {

            deque.removeFirst();
            deque.addLast(nums[i]);

            if (curr_index == 0) {

                curr_max = Integer.MIN_VALUE;
                Object[] arr = deque.toArray();

                for (int j = 0; j < arr.length; j++) {
                    int item = (Integer) arr[j];

                    if (curr_max <= item) {
                        curr_max = item;
                        curr_index = j + 1;
                    }
                }

                ans[ansIdx++] = curr_max;
                curr_index--;
            }
            else if (curr_max > nums[i]) {

                ans[ansIdx++] = curr_max;
                curr_index--;
            }
            else {

                curr_max = nums[i];
                curr_index = k - 1;
                ans[ansIdx++] = curr_max;
            }
        }

        return ans;
    }
}