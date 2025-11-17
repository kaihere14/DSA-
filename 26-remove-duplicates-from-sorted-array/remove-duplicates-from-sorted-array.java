import java.util.HashSet;


class Solution {
    public int removeDuplicates(int[] arr) {
       int l = 0;
        HashSet<Integer> duplicate = new HashSet<>();

        for(int i =0;i<arr.length;i++){
            duplicate.add(arr[i]);
        }
        int newArr[]= new int[duplicate.size()];
        for(int element : duplicate){
            newArr[l++] = element;
        }


        for (int i = 0; i < newArr.length - 1; i++) {
            int minIndex = i;


            for (int j = i + 1; j < newArr.length; j++) {
                if (newArr[j] < newArr[minIndex]) {
                    minIndex = j;
                }
            }


            int temp = newArr[minIndex];
            newArr[minIndex] = newArr[i];
            newArr[i] = temp;
        }

        for(int i =0;i< newArr.length;i++){
           arr[i]= newArr[i];
        }

        return duplicate.size();

    }
}