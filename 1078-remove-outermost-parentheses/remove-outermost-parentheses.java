class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        int counter = 0;
        for(int i = 0 ;i<s.length();i++){
            if(s.charAt(i)==')')counter--;
            if(counter!=0){
                ans += s.charAt(i);
            }
            if(s.charAt(i)=='(')counter++;
        }
        return ans;
    }
}