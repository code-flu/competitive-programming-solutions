class Solution:
  def sumGame(self, num: str) -> bool:
    n = len(num)
    ans = 0.0

    def getExpectation(c: chr) -> float:
      return 4.5 if c == '?' else ord(c) - ord('0')

    for i in range(n // 2):
      ans += getExpectation(num[i])

    for i in range(n // 2, n):
      ans -= getExpectation(num[i])

    return ans != 0.0
