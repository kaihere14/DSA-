class Solution {
    public static String frequencySort(String s) {
        String ans = "";
        int counter[] = new int[128];
        int max = 0 ;
        for(int i = 0 ; i<s.length();i++){
            char curr = s.charAt(i);
            if(counter[curr]>0){
                counter[curr] = counter[curr]+1;
            }else{
                counter[curr] = 1;
            }
        }
        for(int i  = 0;i<s.length();i++){
            int maxIndex = 0;
            for(int j = 0 ; j < counter.length;j++){
                if(counter[maxIndex]< counter[j]){
                    maxIndex = j;
                }
            }
            for(int k = 0 ; k<counter[maxIndex];k++){
                ans += (char)maxIndex;
            }
            counter[maxIndex] = 0;
        }
        return ans;
    }
}