class Solution {
  public int numMusicPlaylists(int n, int goal, int k) {
    this.n = n;
    this.k = k;
    // dp[i][j] := # of playlists with i songs and j different songs
    dp = new long[goal + 1][n + 1];
    Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));
    return (int) playlists(goal, n);
  }

  private static final int kMod = (int) 1e9 + 7;
  private int n;
  private int k;
  private long[][] dp;

  private long playlists(int i, int j) {
    if (i == 0)
      return j == 0 ? 1 : 0;
    if (j == 0)
      return 0;
    if (dp[i][j] >= 0)
      return dp[i][j];

    dp[i][j] = playlists(i - 1, j - 1) * (n - (j - 1));   // last song is new
    dp[i][j] += playlists(i - 1, j) * Math.max(0, j - k); // last song is old
    return dp[i][j] %= kMod;
  }
}
