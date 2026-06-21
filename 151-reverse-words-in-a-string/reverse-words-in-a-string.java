class Solution {
    public  static String reverseWords(String s) {
        s = s.trim();
        String ans ="";
        String[] words = s.trim().split("\\s+");
        for(int i = 0;i<words.length/2;i++){
            String temp = words[i];
            words[i] = words[words.length-i-1];
            words[words.length-i-1]=temp;
        }
        for(int i = 0; i<words.length;i++){
            if(i==words.length-1){
                ans += words[i];
                break;
            }
                ans += words[i]+" ";
        };
        return ans;
    }
}