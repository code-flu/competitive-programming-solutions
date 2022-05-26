class Solution:
  def sumScores(self, s: str) -> int:
    n = len(s)
    z = [0] * n
    # [l, r] := indices of the rightmost segment match
    l = 0
    r = 0

    for i in range(1, n):
      if i <= r:
        z[i] = min(r - i + 1, z[i - l])
      while i + z[i] < n and s[z[i]] == s[i + z[i]]:
        z[i] += 1
      if i + z[i] - 1 > r:
        l = i
        r = i + z[i] - 1

    return sum(z) + n
