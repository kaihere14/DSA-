class Solution {
    public boolean isPowerOfTwo(int n) {
        int ans = (n & (n-1));
        if(n>0 && ans==0)return true;
        return false;
    }
}