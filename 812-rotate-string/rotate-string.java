class Solution {
    public static boolean rotateString(String s, String goal) {
        for(int i = 0 ; i<s.length();i++){
            char t = s.charAt(0);
            s = s.substring(1, s.length())+t;
            if(s.equals(goal)){
                return true;
            }
        }
        return false;
    }
}