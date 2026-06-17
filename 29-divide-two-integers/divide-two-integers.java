class Solution {
    public static int divide(int dividend, int divisor) {
        if(dividend==divisor)return 1;
        long ans = 0;
        boolean sign = true;
        if(dividend>=0 && divisor<0 )sign=false;
        if(dividend<=0 && divisor>0 )sign=false;
        long n = Math.abs((long) dividend);
        long k = Math.abs((long) divisor);
        while (n>=k) {
            int count = 0;
            while(n>=(k<<(count+1))){
                count++;
            }
            ans += (1L<<count);
            n = n - (k<<count);
        }

        if(ans>Integer.MAX_VALUE && sign) return Integer.MAX_VALUE;
        if(ans>Integer.MAX_VALUE && !sign) return Integer.MIN_VALUE;

        return sign?(int)ans:(int)ans*-1;
    }
}