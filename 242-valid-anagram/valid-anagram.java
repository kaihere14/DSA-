class Solution {
    public boolean isAnagram(String s, String t) {
        char [] ar = s.toCharArray();
        Arrays.sort(ar);

        char [] lr = t.toCharArray();
        Arrays.sort(lr);

        boolean check = true;

        if(ar.length == lr.length){
        for (int i = 0 ; i<ar.length ; i++) {
            if(ar[i]!=lr[i]){
                check = false;
                break;
            }
        }
        }else{
            check = false;
        }
        return check;
     }
}