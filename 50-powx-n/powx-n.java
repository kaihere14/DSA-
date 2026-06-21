class Solution {
    public double power(double x, long n){
        if(n==0)return 1;
        if(n%2==1) return (x * power(x,n-1));
        return power(x*x,n/2);
    }
    public double myPow(double x, int n) {
        long k = Math.abs((long)n);
        if(n<0){
            return 1/power(x,k);
        }
        return power(x,k);
    }
}