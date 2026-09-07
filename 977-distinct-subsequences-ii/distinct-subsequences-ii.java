class Solution {
    public int distinctSubseqII(String s) {
        final int MOD = 1_000_000_007;
        long[] dp = new long[26];
        long total = 0;
        for (char ch : s.toCharArray()) {
            int idx = ch - 'a';
            long newVal = (total + 1) % MOD;
            total = (total - dp[idx] + newVal) % MOD;
            dp[idx] = newVal;
            total = (total + MOD) % MOD;
        }
        return (int) total;
    }
}