class Solution {
    public boolean isPalindrome(int n) {
        int temp =n;
        int num = 0;
        while(n>0){
            int l = n%10;
            num = num*10+l;
            n = n/10;
        }
       if(num==temp){
           return true;
       }
       return false;
    }
}
