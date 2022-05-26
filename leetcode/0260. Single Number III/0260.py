class Solution:
  def singleNumber(self, nums: List[int]) -> List[int]:
    xors = reduce(operator.xor, nums)
    lowbit = xors & -xors
    ans = [0, 0]

    # seperate nums into two groups by the lowbit
    for num in nums:
      if num & lowbit:
        ans[0] ^= num
      else:
        ans[1] ^= num

    return ans
