class Solution {
    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) prefix[i + 1] = prefix[i] + stoneValue[i];
        int[][] memo = new int[n][n];
        for (int[] row : memo) Arrays.fill(row, -1);
        return solve(0, n - 1, prefix, memo);
    }

    private int solve(int l, int r, int[] prefix, int[][] memo) {
        if (l == r) return 0;
        if (memo[l][r] != -1) return memo[l][r];
        int best = 0;
        for (int m = l; m < r; m++) {
            int left = prefix[m + 1] - prefix[l];
            int right = prefix[r + 1] - prefix[m + 1];
            if (left < right) {
                best = Math.max(best, left + solve(l, m, prefix, memo));
            } else if (left > right) {
                best = Math.max(best, right + solve(m + 1, r, prefix, memo));
            } else {
                best = Math.max(best, left + Math.max(solve(l, m, prefix, memo), solve(m + 1, r, prefix, memo)));
            }
        }
        memo[l][r] = best;
        return best;
    }
}