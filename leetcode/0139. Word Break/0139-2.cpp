class Solution {
 public:
  bool wordBreak(string s, vector<string>& wordDict) {
    return wordBreak(s, 0, {begin(wordDict), end(wordDict)},
                     vector<int>(s.length(), -1));
  }

 private:
  // return true if s[i:] can be segmented
  bool wordBreak(const string& s, int i, const unordered_set<string>&& wordSet,
                 vector<int>&& memo) {
    if (i == s.length())
      return true;
    if (memo[i] != -1)
      return memo[i];

    for (int j = i + 1; j <= s.length(); ++j)
      if (wordSet.count(s.substr(i, j - i)) &&
          wordBreak(s, j, move(wordSet), move(memo)))
        return memo[i] = 1;

    return memo[i] = 0;
  }
};
