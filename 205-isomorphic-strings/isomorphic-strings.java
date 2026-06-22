class Solution {
    public static boolean isIsomorphic(String s, String t) {
        Boolean ans = true;
        HashMap<Character,Character> count = new HashMap<>();
        for(int i =0 ;i<s.length();i++ ){
            if(count.containsKey(s.charAt(i))){
                char curr = count.get(s.charAt(i));
                if(t.charAt(i)==curr ){
                    continue;
                }else{
                    ans  = false;
                    break;
                }
            }else{
                if(count.containsValue(t.charAt(i))){
                    return false;
                }
                count.put(s.charAt(i), t.charAt(i));
            }
        }
        return ans;
    }
}