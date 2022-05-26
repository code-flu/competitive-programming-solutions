class Solution:
  def buildWall(self, height: int, width: int, bricks: List[int]) -> int:
    kMod = int(1e9) + 7
    # valid rows in bitmask
    rows = []
    self._buildRows(width, bricks, 0, rows)

    n = len(rows)
    # dp[i] := # of ways to build `h` height walls
    # with rows[i] in the bottom
    dp = [1] * n
    # graph[i] := valid neighbors of rows[i]
    graph = [[] for _ in range(n)]

    for i, a in enumerate(rows):
      for j, b in enumerate(rows):
        if not a & b:
          graph[i].append(j)

    for _ in range(2, height + 1):
      newDp = [0] * n
      for i in range(n):
        for v in graph[i]:
          newDp[i] += dp[v]
          newDp[i] %= kMod
      dp = newDp

    return sum(dp) % kMod

  def _buildRows(self, width: int, bricks: List[int], path: int, rows: List[int]):
    for brick in bricks:
      if brick == width:
        rows.append(path)
      elif brick < width:
        newWidth = width - brick
        self._buildRows(newWidth, bricks, path | 2 << newWidth, rows)
