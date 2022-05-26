class Solution:
  def countLatticePoints(self, circles: List[List[int]]) -> int:
    points = set()

    # dx := relative to x
    # dy := relative to y
    # so we have: dx^2 + dy^2 = r^2
    for x, y, r in circles:
      for dx in range(-r, r + 1):
        yMax = int((r**2 - dx**2)**0.5)
        for dy in range(-yMax, yMax + 1):
          points.add((x + dx, y + dy))

    return len(points)
