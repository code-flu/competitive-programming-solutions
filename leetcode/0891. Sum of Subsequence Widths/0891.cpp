class Solution {
 public:
  int sumSubseqWidths(vector<int>& nums) {
    constexpr int kMod = 1e9 + 7;
    const int n = nums.size();
    long ans = 0;
    long exp = 1;

    sort(begin(nums), end(nums));

    for (int i = 0; i < n; ++i, exp = exp * 2 % kMod) {
      ans += (nums[i] - nums[n - i - 1]) * exp;
      ans %= kMod;
    }

    return ans;
  }
};
