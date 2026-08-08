class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        List<Character> ch = new ArrayList();
        int unique_counter = 0;
        int ans = 0;
        for(int i = 0 ; i < s.length() ; i++ ){
            if(!ch.contains(s.charAt(i))){
                unique_counter++;
                ch.add(s.charAt(i));
            }
        }
        

        System.out.println(unique_counter);

        
        for(int i = 0 ; i < s.length() ; i++){
            Set<Character> counter = new HashSet<>();
            boolean found = false;;
            int index = -1;
            for(int j = i ; j<=Math.min(i + unique_counter, s.length()-1) ; j++){
                if (counter.contains(s.charAt(j))) {
                    index = j;
                    break;
                }

                counter.add(s.charAt(j));
                index = j + 1;
            } 
                ans = Math.max(ans,index-i);

        }
        return ans;
    }
}