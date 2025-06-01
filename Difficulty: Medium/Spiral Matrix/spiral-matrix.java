class Solution {
    public int findK(int a[][], int n, int m, int k) {
        int[] arr = new int[n * m]; // Sufficient size
        int srow = 0, scol = 0;
        int erow = n - 1, ecol = m - 1;
        int p = 0;

        while (srow <= erow && scol <= ecol) {
            // Top row
            for (int i = scol; i <= ecol; i++) {
                arr[p++] = a[srow][i];
            }

            // Right column
            for (int i = srow + 1; i <= erow; i++) {
                arr[p++] = a[i][ecol];
            }

            // Bottom row
            if (srow < erow) {
                for (int i = ecol - 1; i >= scol; i--) {
                    arr[p++] = a[erow][i];
                }
            }

            // Left column
            if (scol < ecol) {
                for (int i = erow - 1; i > srow; i--) {
                    arr[p++] = a[i][scol];
                }
            }

            srow++;
            scol++;
            erow--;
            ecol--;
        }

        return arr[k - 1];
    }
}
