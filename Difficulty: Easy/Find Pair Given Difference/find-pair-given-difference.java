
class Solution {
    public boolean findPair(int[] arr, int x) {
        Arrays.sort(arr);
        int i = 0, j = 1;
        
        while (i < arr.length && j < arr.length) {
            if (i != j && arr[j] - arr[i] == x) {
                return true;
            } else if (arr[j] - arr[i] < x) {
                j++;
            } else {
                i++;
            }
        }
        
        return false;
    }
}
