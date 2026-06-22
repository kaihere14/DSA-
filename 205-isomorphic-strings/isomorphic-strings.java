class Solution {
    public static boolean isIsomorphic(String s, String t) {
        int[] sMap = new int[128];
        int[] tMap = new int[128];

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i), tc = t.charAt(i);
            if (sMap[sc] != tMap[tc]) return false;
            sMap[sc] = tMap[tc] = i + 1;
        }
        return true;
    }
}