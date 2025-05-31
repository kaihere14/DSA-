class Solution {
    public boolean isPalindrome(String s) {
        String onlyletters = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start =0;int end =onlyletters.length()-1; 

        while(start<=end){
            if(onlyletters.charAt(start)!=onlyletters.charAt(end)){
                return false;
            }
           start++;end--;
        }
        return true;
    }
}