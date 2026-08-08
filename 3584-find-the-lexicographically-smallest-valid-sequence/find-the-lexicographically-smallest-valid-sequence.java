class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        int[] dp = new int[n + 1];
        dp[n] = 0;
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = dp[i + 1];
            if (dp[i + 1] < m && word1.charAt(i) == word2.charAt(m - dp[i + 1] - 1)) {
                dp[i] = dp[i + 1] + 1;
            }
        }

        int[] result = new int[m];
        int i = 0, j = 0;
        boolean mismatched = false;

        while (i < n && j < m) {
            if (word1.charAt(i) == word2.charAt(j)) {
                result[j] = i;
                i++;
                j++;
            } else if (!mismatched && (m - j - 1) <= dp[i + 1]) {
                mismatched = true;
                result[j] = i;
                i++;
                j++;
            } else {
                i++;
            }
        }

        if (j < m) return new int[0];
        return result;
    }
}