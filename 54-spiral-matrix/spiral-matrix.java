class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int starRow = 0;
        int startCol = 0;
        int endrow =matrix.length-1;
        int endCol = matrix[0].length-1;
        while (starRow <=endrow && startCol <=endCol) {
            //top
            for (int i = startCol; i <= endCol; i++) {
                result.add(matrix[starRow][i]);
            }
            //right
            for (int j = starRow + 1; j <= endrow; j++) {
                result.add(matrix[j][endCol]);
            }
            //bottom

            for (int i1 = endCol - 1; i1 >= startCol; i1--) {
                if(starRow==endrow){
                    break;
                }
                result.add(matrix[endrow][i1]);
            }
            //left
            for (int j1 = endrow - 1; j1 >= starRow + 1; j1--) {
                if(endCol==startCol){
                    break;
                }
                result.add(matrix[j1][startCol]);
            }
            starRow++;
            endCol--;
            endrow--;
            startCol++;
        }return result;
    }
}