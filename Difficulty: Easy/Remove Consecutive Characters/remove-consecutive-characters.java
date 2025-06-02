// User function Template for Java

class Solution {
    public String removeConsecutiveCharacter(String s) {
        // code here
        StringBuilder sh = new StringBuilder("");
        for(int i =0;i<s.length();i++){
            while(i<s.length()-1&&s.charAt(i)==s.charAt(i+1)){
                i++;
            }sh.append(s.charAt(i));
        } s = sh.toString();
        return s;
    }
}