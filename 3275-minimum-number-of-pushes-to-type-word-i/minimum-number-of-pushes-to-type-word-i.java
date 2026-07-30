class Solution {
    
    public int minimumPushes(String word) {
        int ans = 0;
        int curr = 0;
        for(int i = 0 ; i < word.length() ; i++){
            if(i%8==0){
                curr = curr+1;
            }
            ans = ans+curr;
        }
        return ans;
    }
}