class Solution {
    public boolean isPalindrome(int x) {
        String ne = String.valueOf(x);
        boolean check = false;
        int start = 0;
        int end = ne.length()-1;
        while(start<=end){
            if(ne.charAt(start)==ne.charAt(end)){
                check = true;
            }else {
                check = false;
                return check;
            }
            start++;
            end--;
        }return check;
}
}