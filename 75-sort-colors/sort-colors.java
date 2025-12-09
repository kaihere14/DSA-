class Solution {
    public void sortColors(int[] arr) {
        int count_0 =0;
        int count_1=0;
        int count_2=0;
        for(int j =0;j<arr.length;j++) {
            if(arr[j]==0)count_0++;
            if(arr[j]==1)count_1++;
            if(arr[j]==2)count_2++;
        }
        for(int i=0;i<count_0;i++){
            arr[i]=0;
        }
         for(int i=0;i<count_1;i++){
            arr[i+count_0]=1;
        } for(int i=0;i<count_2;i++){
            arr[i+count_0+count_1]=2;
        }
    }
}