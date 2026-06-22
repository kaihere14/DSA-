class Solution {
    public static boolean rotateString(String s, String goal) {
        for(int i = 0 ; i<s.length();i++){
            if(s.length()!=goal.length()) return false;
            return (s+s).contains(goal);
        }
        return false;
    }
}