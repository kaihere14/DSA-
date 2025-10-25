class Solution {
    public boolean isPalindrome(int n) {
        int temp =n;
        int num = 0;
        boolean check = false;
        while(n>0){
            int l = n%10;
            num = num*10+l;
            n = n/10;
        }
       if(num==temp){
           check =true;
       }
       return check;
    }
}
