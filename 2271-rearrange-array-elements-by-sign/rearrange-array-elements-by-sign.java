class Solution {
    public int[] rearrangeArray(int[] arr) {
        int length = (arr.length/2);
        int[] positive = new int[length];
        int[] negative = new int[length];
        int pos_start = 0;
        int neg_start = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>0){
                positive[pos_start] = arr[i];
                pos_start++;
                System.out.println("positive"+arr[i]);
            }
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]<0){
                negative[neg_start++] = arr[i];
                System.out.println("negative : "+arr[i]);
            }
        }
        pos_start =0;
        neg_start=0;
        for(int i =0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=positive[pos_start++];
            }else{
                arr[i]= negative[neg_start++];
            }
        }

        for(int i =0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        return arr;
    }
}