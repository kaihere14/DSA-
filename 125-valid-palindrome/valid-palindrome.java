class Solution {
    public boolean isPalindrome(String s) {
        String onlyLetters1 = s.replaceAll("[^a-zA-Z0-9]", "");
        String onlyletters = onlyLetters1.toLowerCase();
        int start =0;
        int end =onlyletters.length()-1;
        boolean check = true;
        while(start<=end){
            if(onlyletters.charAt(start)!=onlyletters.charAt(end)){
                check =false;
            }
           start++;end--;
        }return check;
    }
}