class Solution {
    public boolean isAnagram(String s, String t) {
        String z =  s;
        char [] ar = s.toCharArray();
        //sort all the chr from a to z
        Arrays.sort(ar);
        String m = t;
        char [] lr = t.toCharArray();
        Arrays.sort(lr);
        boolean check = false;
        if(ar.length == lr.length){
        for (int i = ar.length-1; i>=0; i--) {
            if (ar[i]==lr[i]) {
                check = true;
            }else{
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