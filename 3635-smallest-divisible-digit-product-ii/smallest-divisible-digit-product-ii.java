import java.util.*;

class Solution {
    int A, B;
    int[][] minDigits23;
    int[] V2 = new int[10], V3 = new int[10], V5 = new int[10], V7 = new int[10];

    public String smallestNumber(String num, long t) {
        V2[2]=1; V2[4]=2; V2[6]=1; V2[8]=3;
        V3[3]=1; V3[6]=1; V3[9]=2;
        V5[5]=1;
        V7[7]=1;

        long tt = t;
        int a=0,b=0,c=0,d=0;
        while (tt % 2 == 0) { tt/=2; a++; }
        while (tt % 3 == 0) { tt/=3; b++; }
        while (tt % 5 == 0) { tt/=5; c++; }
        while (tt % 7 == 0) { tt/=7; d++; }
        if (tt != 1) return "-1";
        A=a; B=b;

        minDigits23 = new int[a+1][b+1];
        for (int[] row : minDigits23) Arrays.fill(row, -1);
        minDigits23[0][0] = 0;
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0,0});
        int[][] moves = {{1,0},{0,1},{2,0},{1,1},{3,0},{0,2}};
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int i=cur[0], j=cur[1];
            int base = minDigits23[i][j];
            for(int[] mv: moves){
                int ni = Math.min(a, i+mv[0]);
                int nj = Math.min(b, j+mv[1]);
                if (minDigits23[ni][nj]==-1){
                    minDigits23[ni][nj]=base+1;
                    queue.add(new int[]{ni,nj});
                }
            }
        }

        int n = num.length();
        int[] digits = new int[n];
        for(int i=0;i<n;i++) digits[i]=num.charAt(i)-'0';

        int firstZero = n;
        for(int i=0;i<n;i++){ if(digits[i]==0){ firstZero=i; break; } }

        long[] P2=new long[n+1], P3=new long[n+1], P5=new long[n+1], P7=new long[n+1];
        for(int i=0;i<n;i++){
            int dg=digits[i];
            P2[i+1]=P2[i]+V2[dg];
            P3[i+1]=P3[i]+V3[dg];
            P5[i+1]=P5[i]+V5[dg];
            P7[i+1]=P7[i]+V7[dg];
        }

        if (firstZero==n){
            if (P2[n]>=a && P3[n]>=b && P5[n]>=c && P7[n]>=d){
                return num;
            }
        }

        for(int i=n-1;i>=0;i--){
            if (i>firstZero) continue;
            for(int dg=digits[i]+1; dg<=9; dg++){
                long used2 = P2[i]+V2[dg];
                long used3 = P3[i]+V3[dg];
                long used5 = P5[i]+V5[dg];
                long used7 = P7[i]+V7[dg];
                int ra = (int)Math.max(0, a-used2);
                int rb = (int)Math.max(0, b-used3);
                int rc = (int)Math.max(0, c-used5);
                int rd = (int)Math.max(0, d-used7);
                int remLen = n-1-i;
                if (feasible(ra,rb,rc,rd,remLen)){
                    StringBuilder sb = new StringBuilder();
                    sb.append(num, 0, i);
                    sb.append((char)('0'+dg));
                    int[] suffix = buildSuffix(ra,rb,rc,rd,remLen);
                    for(int x: suffix) sb.append((char)('0'+x));
                    return sb.toString();
                }
            }
        }

        int M = c + d + minDigits23[a][b];
        int L = Math.max(n+1, M);
        int[] full = buildSuffix(a,b,c,d,L);
        StringBuilder sb = new StringBuilder();
        for(int x: full) sb.append((char)('0'+x));
        return sb.toString();
    }

    boolean feasible(int ra,int rb,int rc,int rd,int length){
        if(ra>A || rb>B) return false;
        int need = rc+rd+minDigits23[ra][rb];
        return need<=length;
    }

    int[] buildSuffix(int ra,int rb,int rc,int rd,int length){
        int[] res = new int[length];
        for(int pos=0; pos<length; pos++){
            for(int dg=1; dg<=9; dg++){
                int nra = Math.max(0, ra-V2[dg]);
                int nrb = Math.max(0, rb-V3[dg]);
                int nrc = Math.max(0, rc-V5[dg]);
                int nrd = Math.max(0, rd-V7[dg]);
                if (feasible(nra,nrb,nrc,nrd,length-pos-1)){
                    res[pos]=dg;
                    ra=nra;rb=nrb;rc=nrc;rd=nrd;
                    break;
                }
            }
        }
        return res;
    }
}