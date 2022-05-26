class Solution:
  def numEquivDominoPairs(self, dominoes: List[List[int]]) -> int:
    ans = 0
    count = Counter()

    for domino in dominoes:
      key = min(domino[0], domino[1]) * 10 + max(domino[0], domino[1])
      ans += count[key]
      count[key] += 1

    return ans
