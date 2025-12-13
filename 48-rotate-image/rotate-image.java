class Solution {
    public void rotate(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int arr2[][] = new int[row][col];
        for(int i =row-1;i>=0;i--){
            for(int j = 0;j<col;j++){
                arr2[j][row-i-1]= arr[i][j];
            }
        }
        for(int i =0 ;i<row;i++){
            for(int j =0;j<col;j++){
                arr[i][j]=arr2[i][j];
            }
        }
    }
}