class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        
        String onlyletters = sb.toString();
        int start = 0, end = onlyletters.length() - 1;
        while(start<=end){
            if(onlyletters.charAt(start)!=onlyletters.charAt(end)){
                return false;
            }
           start++;end--;
        }
        return true;
    }
}