class Solution {
    public  static String reverseWords(String s) {
        s = s.trim();
        String ans ="";
        String[] words = s.trim().split("\\s+");
        for(int i = words.length-1;i>=0;i--){
            if(i==0){
                ans += words[i];
                break;
            }
            ans += words[i]+" ";
        }

        return ans;
    }
}