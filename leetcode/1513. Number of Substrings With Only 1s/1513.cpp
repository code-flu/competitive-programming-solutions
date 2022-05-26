class Solution {
 public:
  int numSub(string s) {
    constexpr int kMod = 1e9 + 7;

    int ans = 0;
    int l = -1;

    for (int i = 0; i < s.length(); ++i) {
      if (s[i] == '0')
        l = i;  // handle reset value
      ans = (ans + i - l) % kMod;
    }

    return ans;
  }
};
