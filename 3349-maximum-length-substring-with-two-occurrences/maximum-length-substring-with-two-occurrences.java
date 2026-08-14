class Solution {
    public int maximumLengthSubstring(String s) {
        int counter[] = new int[26];

        int right_pointer = 0;
        int left_pointer = 0;

        int max_count = 0;

        while(right_pointer<s.length()){ 
            counter[s.charAt(right_pointer)-'a'] = counter[s.charAt(right_pointer)-'a']+1;
            while(left_pointer<=right_pointer && counter[s.charAt(right_pointer)-'a']>2){
                counter[s.charAt(left_pointer)-'a'] = counter[s.charAt(left_pointer)-'a']-1;
                left_pointer++;
            }
            max_count = Math.max(max_count,right_pointer-left_pointer+1);
            right_pointer++;
        }
        return max_count;
    }
}