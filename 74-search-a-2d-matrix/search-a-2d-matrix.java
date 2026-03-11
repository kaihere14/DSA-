class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (matrix[0][0] > target || matrix[rows-1][cols-1] < target) {
            return false;
        }

        int possible_row = 0;
        for (int i = 0; i < rows; i++) {
            if (matrix[i][cols-1] >= target) {
                possible_row = i;
                break;
            }
        }

        int left = 0, right = cols - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value_mid = matrix[possible_row][mid];
            if (value_mid == target) return true;
            else if (value_mid < target) left = mid + 1;
            else right = mid - 1;
        }

        return false;
    }
}