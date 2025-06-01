

class Solution {
    public int DiagonalSum(int[][] matrix) {
        // code here
        int sum1 =0;
        int sum2 = 0;
        for(int i =0;i<matrix.length;i++){
            sum1 += matrix[i][i];
        }
        int col = matrix[0].length-1;
        int row=0;
        while(col>=0 && row<matrix.length){
            sum2 += matrix[row][col];
            row++;
            col--;
        }
        int ans =sum1+sum2;
        return ans;
    }
}