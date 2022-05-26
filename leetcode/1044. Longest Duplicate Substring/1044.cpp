class Solution {
 public:
  string longestDupSubstring(string s) {
    constexpr int kMod = 1e9 + 7;
    const int n = s.length();
    vector<int> pows(n, 1);
    int bestStart = -1;
    int l = 1;
    int r = n;

    for (int i = 1; i < n; ++i)
      pows[i] = (pows[i - 1] * 26L) % kMod;

    while (l < r) {
      const int m = (l + r) / 2;
      const int start = getStart(s, m, pows, kMod);
      if (start == -1) {
        r = m;
      } else {
        bestStart = start;
        l = m + 1;
      }
    }

    if (bestStart == -1)
      return "";
    if (getStart(s, l, pows, kMod) == -1)
      return s.substr(bestStart, l - 1);
    return s.substr(bestStart, l);
  }

 private:
  // k := length of hashed substring
  int getStart(const string& s, int k, const vector<int>& pows,
               const int& kMod) {
    unordered_map<int, vector<int>> hashedToStarts;
    long long h = 0;

    // compute hash value of s[:k]
    for (int i = 0; i < k; ++i)
      h = ((h * 26) % kMod + val(s[i])) % kMod;
    hashedToStarts[h].push_back(0);

    // compute rolling hash by Rabin Karp
    for (int i = k; i < s.length(); ++i) {
      const int startIndex = i - k + 1;
      h = ((h - static_cast<long long>(pows[k - 1]) * val(s[i - k])) % kMod +
           kMod) %
          kMod;
      h = (h * 26 + val(s[i])) % kMod;
      if (hashedToStarts.count(h)) {
        const auto& currSub = s.substr(startIndex, k);
        for (const int start : hashedToStarts[h])
          if (s.substr(start, k) == currSub)
            return startIndex;
      }
      hashedToStarts[h].push_back(startIndex);
    }

    return -1;
  }

  int val(char c) {
    return c - 'a';
  }
};
