class Solution {
    public int[][] transpose(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int transpose[][]=  new int [col][row];
            for(int i =0;i<arr.length;i++){
                for(int j =0;j<arr[0].length;j++){
                    transpose[j][i]=arr[i][j];
                }
        }return transpose;
    }
}