class FenwickTree:
  def __init__(self, n: int):
    self.sums = [0] * (n + 1)

  def update(self, i: int, delta: int) -> None:
    while i < len(self.sums):
      self.sums[i] += delta
      i += self._lowbit(i)

  def get(self, i: int) -> int:
    sum = 0
    while i > 0:
      sum += self.sums[i]
      i -= self._lowbit(i)
    return sum

  def _lowbit(self, i) -> int:
    return i & -i


class Solution:
  def countSmaller(self, nums: List[int]) -> List[int]:
    ans = []
    ranks = Counter()
    self._getRanks(nums, ranks)
    tree = FenwickTree(len(ranks))

    for num in reversed(nums):
      ans.append(tree.get(ranks[num] - 1))
      tree.update(ranks[num], 1)

    return ans[::-1]

  def _getRanks(self, nums: List[int], ranks: Dict[int, int]) -> None:
    rank = 0
    for num in sorted(set(nums)):
      rank += 1
      ranks[num] = rank
