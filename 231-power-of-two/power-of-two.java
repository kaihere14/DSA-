class Solution {
    public boolean isPowerOfTwo(int n) {
        
       if(n>0){
         n = n & (n-1);
        if(n==0)return true;
        return false;
       }
       return false;
    }
}