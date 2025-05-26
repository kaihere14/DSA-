class Solution {
    public List<Integer> findDuplicates(int[] arr) {
    List<Integer> duplicates = new ArrayList<>();
    Arrays.sort(arr);
    int start =0;
    int end =1;
    while(end<arr.length){
        if(arr[start]==arr[end]){
            duplicates.add(arr[end]);
        }start++;
        end++;
    }
    return duplicates;
    }
}
