class Solution:
  def asteroidCollision(self, asteroids: List[int]) -> List[int]:
    stack = []

    for a in asteroids:
      if a > 0:
        stack.append(a)
      else:  # a < 0
        # destroy previous positive one(s)
        while stack and stack[-1] > 0 and stack[-1] < -a:
          stack.pop()
        if not stack or stack[-1] < 0:
          stack.append(a)
        elif stack[-1] == -a:
          stack.pop()  # both explode
        else:  # stack[-1] > current
          pass  # destroy current, so do nothing

    return stack
