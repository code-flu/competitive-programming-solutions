class Solution:
  def numOfPairs(self, nums: List[str], target: str) -> int:
    ans = 0
    count = Counter()

    for num in nums:
      k = len(num)
      if target[:k] == num:
        ans += count[target[k:]]
      if target[-k:] == num:
        ans += count[target[:-k]]
      count[num] += 1

    return ans
