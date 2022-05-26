class Solution:
  def checkPartitioning(self, s: str) -> bool:
    # dp(i, j) := True if s[i:j] is a palindrome
    @lru_cache(None)
    def dp(i, j):
      if i > j - 1:
        return True
      if s[i] == s[j - 1]:
        return dp(i + 1, j - 1)
      return False

    n = len(s)

    for i in range(n):
      for j in range(i, n):
        if dp(0, i) and dp(i, j) and dp(j, n):
          return True

    return False
