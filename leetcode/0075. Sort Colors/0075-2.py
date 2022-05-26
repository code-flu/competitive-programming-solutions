class Solution:
  def sortColors(self, nums: List[int]) -> None:
    l = 0  # next 0 should be put in l
    r = len(nums) - 1  # next 2 should be put in r

    i = 0
    while i <= r:
      if nums[i] == 0:
        nums[i], nums[l] = nums[l], nums[i]
        i += 1
        l += 1
      elif nums[i] == 1:
        i += 1
      else:
        # we may swap a 0 to index i, but we're still not sure whether
        # this 0 is put in the correct index, so we can't move pointer i
        nums[i], nums[r] = nums[r], nums[i]
        r -= 1
