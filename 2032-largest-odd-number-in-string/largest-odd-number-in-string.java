
class Solution {
    public static String largestOddNumber(String num) {
        int largestIndex = -1;
        for(int i = num.length()-1 ; i>=0;i--){
            char currString = num.charAt(i);
            int curr = currString - '0';
            if(curr%2==1){
               largestIndex = i;
               break;
            }
        }
        if(largestIndex==-1){
            return "";
        }
        String ans = "";
        for(int i = 0 ;i<=largestIndex;i++){
            ans += num.charAt(i);
        }

        return ans;
    }
}