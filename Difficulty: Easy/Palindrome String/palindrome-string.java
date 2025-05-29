class Solution {
    boolean isPalindrome(String s) {
        // code here
        char[] chars = s.toCharArray();
       int start =0;
       boolean check =false;
       int end =chars.length-1;
       while(start<=end){
           if(chars[start]==chars[end]){
               check =true;
               start++;
               end--;
           }else if(chars[start]!=chars[end]){
               check=false;
               break;
           }
       }return check;
       
    }
}