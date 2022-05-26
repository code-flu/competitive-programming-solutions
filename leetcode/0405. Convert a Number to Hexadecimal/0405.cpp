class Solution {
 public:
  string toHex(unsigned num) {
    const vector<char> hex{'0', '1', '2', '3', '4', '5', '6', '7',
                           '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    string ans;

    while (num) {
      ans += hex[num & 0xf];
      num >>= 4;
    }

    reverse(begin(ans), end(ans));
    return ans.empty() ? "0" : ans;
  }
};
