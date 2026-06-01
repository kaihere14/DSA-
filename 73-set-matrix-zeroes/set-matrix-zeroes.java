class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> colum = new HashSet<>();
        Set<Integer> row = new HashSet<>();
        for(int i  = 0 ;i<matrix.length;i++){
            for(int j = 0 ; j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    colum.add(j);
                }
            }
        }
        for (Integer x : row) {
            for(int i = 0 ; i<matrix[0].length;i++){
                matrix[x][i]=0;
            }
        }
        for (Integer x : colum) {
            for(int i = 0 ; i<matrix.length;i++){
                matrix[i][x]=0;
            }
        }
    }
}