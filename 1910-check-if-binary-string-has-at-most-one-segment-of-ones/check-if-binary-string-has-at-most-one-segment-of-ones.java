class Solution {
    public boolean checkOnesSegment(String s) {
        int total = 0;
        for(int i = 0; i<s.length();i++){
            char a = s.charAt(i);
            char b = '1';
            if(a==b){
                total++;
            }
        }
        int count  = 0;
        for(int i = 0; i<s.length();i++){
            char a = s.charAt(i);
            char b = '1';
            if(a==b){
                count++;
            }else{
                if(count<total){
                    return  false;
                }
            }
        }

        return true;
    }
}