class Solution:
  def buildArray(self, target: List[int], n: int) -> List[str]:
    ans = []
    i = 0  # target pointer
    num = 1  # curr num

    while i < len(target):
      t = target[i]
      if t == num:
        ans.append("Push")
        i += 1
      else:
        ans.append("Push")
        ans.append("Pop")
      num += 1

    return ans
