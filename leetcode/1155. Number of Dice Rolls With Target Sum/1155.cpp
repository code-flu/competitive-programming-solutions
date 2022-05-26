class Solution {
 public:
  int numRollsToTarget(int n, int k, int target) {
    constexpr int kMod = 1e9 + 7;
    vector<int> dp(target + 1);
    dp[0] = 1;

    while (n--) {  // n dices
      vector<int> newDp(target + 1);
      for (int i = 1; i <= k; ++i)           // number 1, 2, ..., f
        for (int t = i; t <= target; ++t) {  // possible targets
          newDp[t] += dp[t - i];
          newDp[t] %= kMod;
        }
      dp = move(newDp);
    }

    return dp[target];
  }
};
