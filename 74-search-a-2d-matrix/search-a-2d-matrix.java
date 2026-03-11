class Solution {
    public static  boolean searchMatrix(int[][] matrix, int target) {
        int start_row = 0;
        int end_row =  matrix.length-1;
        int col_start = 0;
        int col_end = matrix[0].length-1;

        if(matrix[start_row][0]>target || matrix[end_row][col_end]<target){
            return  false;
        }
        int possible_row = 0;

        for(int i = 0 ;i<matrix.length;i++){
            if(matrix[i][col_end]>=target){
                possible_row = i;
                break;
            }
        }
        for(int i  =0 ;i<=col_end;i++){
            if(matrix[possible_row][i]==target){
                return true;
            }
        }

        return  false;
    }
}