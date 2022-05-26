class Solution {
  public int numPermsDISequence(String s) {
    final int kMod = (int) 1e9 + 7;
    final int n = s.length();
    // dp[i][j] := # of valid permutations w/ i + 1 digits, where s[i] is j-th
    // digit of remaining digits
    int[][] dp = new int[n + 1][n + 1];

    // when there's only one digit, the # of perms is 1
    for (int j = 0; j <= n; ++j)
      dp[0][j] = 1;

    for (int i = 1; i <= n; ++i)
      if (s.charAt(i - 1) == 'I') { // s[i - 1] == 'I'
        // calculate postfix sum to prevent duplicate calculation
        int postfixsum = 0;
        for (int j = n - i; j >= 0; --j) {
          postfixsum = (postfixsum + dp[i - 1][j + 1]) % kMod;
          dp[i][j] = postfixsum;
        }
      } else { // s[i - 1] == 'D'
        // calculate prefix sum to prevent duplicate calculation
        int prefix = 0;
        for (int j = 0; j <= n - i; ++j) {
          prefix = (prefix + dp[i - 1][j]) % kMod;
          dp[i][j] = prefix;
        }
      }

    return dp[n][0];
  }
}
