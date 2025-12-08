class Solution {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Sort left half
            mergeSort(arr, left, mid);

            // Sort right half
            mergeSort(arr, mid + 1, right);

            // Merge both halves
            merge(arr, left, mid, right);
        }
    }

    // Function to merge two sorted halves
    public static void merge(int[] arr, int left, int mid, int right) {
        // Sizes of two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // Merge the temp arrays
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public int longestConsecutive(int[] arr) {
        int max = 0;
        int count = 0;
        int max_count = 0;
        if(arr.length==0){
            return 0;
        }
        
        mergeSort(arr,0,arr.length-1);
       
        for(int i =0;i<arr.length-1;i++){
             if(i>0&&arr[i]==arr[i+1]){
                continue;
            }
            if(arr[i]==arr[i+1]-1) {
                count++;
            }else{
                count=0;
            }
            max_count = Math.max(max_count,count);
        }
        return max_count+1;
    }
}