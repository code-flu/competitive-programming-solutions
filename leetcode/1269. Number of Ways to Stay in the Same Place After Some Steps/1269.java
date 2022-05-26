class Solution {
  public int numWays(int steps, int arrLen) {
    final int kMod = (int) 1e9 + 7;
    final int n = Math.min(arrLen, steps / 2 + 1);
    // dp[i] := # of ways to stay on index i
    long[] dp = new long[n];
    dp[0] = 1;

    while (steps-- > 0) {
      long[] newDp = new long[n];
      for (int i = 0; i < n; ++i) {
        newDp[i] = dp[i];
        if (i - 1 >= 0)
          newDp[i] += dp[i - 1];
        if (i + 1 < n)
          newDp[i] += dp[i + 1];
        newDp[i] %= kMod;
      }
      dp = newDp;
    }

    return (int) dp[0];
  }
}
