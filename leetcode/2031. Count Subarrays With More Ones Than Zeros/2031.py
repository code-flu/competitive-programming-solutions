class FenwichTree:
  def __init__(self, n: int):
    self.n = n
    self.sums = [0] * (2 * n + 1)

  def update(self, i: int, delta: int) -> None:
    i += self.n + 1  # re-mapping
    while i < len(self.sums):
      self.sums[i] += delta
      i += i & -i

  def get(self, i: int) -> int:
    i += self.n + 1  # re-mapping
    sum = 0
    while i > 0:
      sum += self.sums[i]
      i -= i & -i
    return sum


class Solution:
  def subarraysWithMoreZerosThanOnes(self, nums: List[int]) -> int:
    kMod = int(1e9) + 7
    ans = 0
    prefix = 0
    tree = FenwichTree(len(nums))
    tree.update(0, 1)

    for num in nums:
      prefix += -1 if num == 0 else 1
      ans += tree.get(prefix - 1)
      ans %= kMod
      tree.update(prefix, 1)

    return ans
