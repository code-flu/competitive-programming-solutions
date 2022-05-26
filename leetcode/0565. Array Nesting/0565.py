class Solution:
  def arrayNesting(self, nums: List[int]) -> int:
    ans = 0

    for num in nums:
      if num == -1:
        continue
      index = num
      count = 0
      while nums[index] != -1:
        temp = index
        index = nums[index]
        nums[temp] = -1
        count += 1
      ans = max(ans, count)

    return ans
