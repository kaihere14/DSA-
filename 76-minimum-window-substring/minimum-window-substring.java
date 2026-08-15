class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> mp = new HashMap<>();
        HashMap<Character, Integer> cnt = new HashMap<>();

        for(char c : t.toCharArray()){
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        int need = mp.size();
        int got = 0;

        int l = 0;
        int ans = Integer.MAX_VALUE;
        int idx = 0;

        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);

            cnt.put(c, cnt.getOrDefault(c, 0) + 1);

            if(mp.containsKey(c) && cnt.get(c).equals(mp.get(c))){
                got++;
            }

            while(got == need){
                if(r - l + 1 < ans){
                    ans = r - l + 1;
                    idx = l;
                }

                char x = s.charAt(l);
                cnt.put(x, cnt.get(x) - 1);

                if(mp.containsKey(x) && cnt.get(x) < mp.get(x)){
                    got--;
                }

                l++;
            }
        }

        if(ans == Integer.MAX_VALUE) return "";

        return s.substring(idx, idx + ans);
    }
}