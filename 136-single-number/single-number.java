class Solution {
    public int singleNumber(int[] arr) {
        boolean check = false;
        int start=0;
        for(int i =0;i<arr.length;i++){
            start=i;
            check=false;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i] &i!=j){
                    check=true;
                }
            }
            if(!check){
                return arr[start];
            }
        }
        return arr[start];
    }
}