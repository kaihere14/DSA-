class Solution {
    static  void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    
    public List<List<Integer>> threeSum(int[] arr) {
         bubbleSort(arr);
        List<List<Integer>> answer = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int target = arr[i];
            int start = i + 1;
            int end = arr.length - 1;

            while (start < end) {
                int sum = arr[start] + arr[end];

                if (sum == -target) {
                    answer.add(Arrays.asList(target, arr[start], arr[end]));
                    start++;
                    end--;
                    while (start < end && arr[start] == arr[start - 1]) start++;
                    while (start < end && arr[end] == arr[end + 1]) end--;
                } else if (sum > -target) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return answer;
    }
}