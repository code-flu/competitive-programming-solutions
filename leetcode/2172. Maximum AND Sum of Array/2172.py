class Solution:
  def maximumANDSum(self, nums: List[int], numSlots: int) -> int:
    n = 2 * numSlots
    nSelected = 1 << n
    # dp[i] := max value given mask representing the nums selected
    dp = [0] * nSelected

    nums += [0] * (n - len(nums))

    for mask in range(1, nSelected):
      selected = mask.bit_count()
      slot = (selected + 1) // 2  # (1, 2) -> 1, (3, 4) -> 2
      for i, num in enumerate(nums):
        if mask >> i & 1:  # assign nums[i] to `slot`-th slot
          dp[mask] = max(dp[mask], dp[mask ^ 1 << i] + (slot & num))

    return dp[-1]
