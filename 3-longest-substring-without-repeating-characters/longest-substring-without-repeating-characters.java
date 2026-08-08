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
        

        for(int i = 0 ; i < s.length() ; i++){
            
            int arr[] = new int[250];
            boolean found = false;;
            int index = -1;
            for(int j = i ; j<=Math.min(i + unique_counter, s.length()-1) ; j++){
                if(ans==unique_counter)return ans;
               
                if (arr[s.charAt(j)]!=0) {
                    index = j;
                    break;
                }

                arr[s.charAt(j)]=1;
                index = j + 1;
            } 
                ans = Math.max(ans,index-i);

        }
        return ans;
    }
}