class Solution {

    public int minimumPushes(String word) {
        Map<Character, Integer> counter_map = new HashMap<>();
        int ans = 0;

        for(int i = 0 ; i < word.length() ; i++){
            counter_map.put(word.charAt(i), counter_map.getOrDefault(word.charAt(i), 0) + 1);
        }

        List<Integer> freqs = new ArrayList<>(counter_map.values());
        freqs.sort(Collections.reverseOrder());

        for(int i = 0 ;i<freqs.size();i++){
            int multiplier = (i / 8) + 1; 
            ans += freqs.get(i) * multiplier;
        }
        return ans;
    }
}