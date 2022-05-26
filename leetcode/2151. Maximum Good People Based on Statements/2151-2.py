class Solution:
  def maximumGood(self, statements: List[List[int]]) -> int:
    n = len(statements)

    def isValid(mask: int) -> bool:
      for i in range(n):
        if not (mask >> i & 1):  # i-th person is bad, no need to check
          continue
        for j in range(n):
          if statements[i][j] == 2:
            continue
          if statements[i][j] != (mask >> j & 1):
            return False
      return True

    return max(bin(mask).count('1') for mask in range(1 << n) if isValid(mask))
