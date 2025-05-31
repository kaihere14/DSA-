// User function Template for Java

class Solution {
    public boolean isPalindrome(int n) {
        // Code here
        String s =String.valueOf(n);
        int start =0;
        int end =s.length()-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }start++;end--;
        }
        return true;
    }
}