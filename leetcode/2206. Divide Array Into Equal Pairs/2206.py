class Solution:
  def divideArray(self, nums: List[int]) -> bool:
    return all(value % 2 == 0 for value in Counter(nums).values())
