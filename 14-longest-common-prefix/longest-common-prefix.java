class Solution {
    public static String longestCommonPrefix(String[] strs) {
      String ans="";
      for(int i = 0;i<strs[0].length();i++){
        char curr = strs[0].charAt(i);
        Boolean same = true;
        for(int j = 1; j<strs.length;j++){
            if(i>=strs[j].length()){
                same= false;
                break;
            }
            if(curr != strs[j].charAt(i)){
                same = false;
                break;
            }
        }
        if(!same)break;
        ans += curr;
      }
      return ans;

    }
}