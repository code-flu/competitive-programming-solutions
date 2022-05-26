class Solution:
  def countNicePairs(self, nums: List[int]) -> int:
    freqs = Counter(num - int(str(num)[::-1]) for num in nums)
    return sum(freq * (freq - 1) // 2 for freq in freqs.values()) % 1000000007
