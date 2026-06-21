class Solution {
    public  static String reverseWords(String s) {
        s = s.trim();
        String ans ="";
        String[] words = s.trim().split(" ");
        for(int i = words.length-1;i>=0;i--){
            if(i==0){
                ans = new String(ans + words[i]);
                break;
            }
            if(!words[i].equals("")){
                ans = new String(ans + words[i] + " ");
            }
        }
        return ans;
    }
}