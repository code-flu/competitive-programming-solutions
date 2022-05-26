class Solution {
 public:
  vector<bool> canMakePaliQueries(string s, vector<vector<int>>& queries) {
    vector<bool> ans;
    vector<int> dp(s.length() + 1);

    for (int i = 1; i <= s.length(); ++i)
      dp[i] = dp[i - 1] ^ 1 << s[i - 1] - 'a';

    for (const auto& q : queries) {
      const int odds = __builtin_popcount(dp[q[1] + 1] ^ dp[q[0]]);
      ans.push_back(odds / 2 <= q[2]);
    }

    return ans;
  }
};
