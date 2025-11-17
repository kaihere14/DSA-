import java.util.HashSet;


class Solution {
    public int removeDuplicates(int[] arr) {
       int i =0;
        for(int k =1;k<arr.length;k++){
            if(arr[i]!=arr[k]){
                i++;
                arr[i]= arr[k];
            }
        }
        return ++i;

    }
}