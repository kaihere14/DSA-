class Solution {
    public int[] rearrangeArray(int[] arr) {
        int[] arr2 = new int[arr.length];
        int pos_start = 0;
        int neg_start = 1;
        for(int i  =0;i<arr.length;i++){
            if(arr[i]>0){
                arr2[pos_start]=arr[i];
                pos_start += 2;
            }else if (arr[i]<0){
                arr2[neg_start]=arr[i];
                neg_start +=2;
            }
        }
        return arr2;
    }
}