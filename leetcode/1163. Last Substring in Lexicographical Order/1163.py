class Solution:
  def lastSubstring(self, s: str) -> str:
    i = 0
    j = 1
    k = 0  # number of same characters of s[i:] and s[j:]

    while j + k < len(s):
      if s[i + k] == s[j + k]:
        k += 1
      elif s[i + k] > s[j + k]:
        # now s[i:i + k] == s[j:j + k] and s[i + k] > s[j + k] means that
        # we should start from s[j + k] to find a possible larger substring
        j += k + 1
        k = 0
      else:
        # now s[i:i + k] == s[j:j + k] and s[i + k] < s[j + k] means that
        # either starting from s[i + k + 1] or s[j] has a larger substring
        i = max(i + k + 1, j)
        j = i + 1
        k = 0

    return s[i:]
