class Solution:
  def sumSubarrayMins(self, arr: List[int]) -> int:
    kMod = int(1e9) + 7
    n = len(arr)
    ans = 0
    prev = [-1] * n
    next = [n] * n
    stack = []

    for i, a in enumerate(arr):
      while stack and arr[stack[-1]] > a:
        index = stack.pop()
        next[index] = i
      if stack:
        prev[i] = stack[-1]
      stack.append(i)

    for i, a in enumerate(arr):
      ans += a * (i - prev[i]) * (next[i] - i)
      ans %= kMod

    return ans
