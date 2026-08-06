class Solution {
    public int smallestNumber(int n, int t) {
        int curr_num = 1;

        for(int i = n ; i < n+100 ; i++){
            int num = i ;
            curr_num = 1;
            while(num!=0){
                curr_num = curr_num*(num%10);
                num = num/10;
            }
            if(curr_num%t==0){
                return i;
            }
        }
        return -1;
    }
}