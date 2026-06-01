import java.math.BigInteger;

class Solution {
    public static BigInteger calcFactorial(int num){
        BigInteger ans = BigInteger.ONE;
        for(int i = num; i > 0; i--){
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row = 0; row < numRows; row++){
            List<Integer> perRow = new ArrayList<>();
            BigInteger n = calcFactorial(row);
            for(int col = 0; col <= row; col++){
                BigInteger k = calcFactorial(col);
                BigInteger kn = calcFactorial(row - col);
                int total = n.divide(k.multiply(kn)).intValue();
                perRow.add(total);
            }
            ans.add(perRow);
        }
        return ans;
    }
}