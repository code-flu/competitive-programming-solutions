class Solution:
  def secondMinimum(self, n: int, edges: List[List[int]], time: int, change: int) -> int:
    graph = [[] for _ in range(n + 1)]
    q = deque([(1, 0)])
    # minTime[i][0] := 1st min time to reach node i
    # minTime[i][1] := 2nd min time to reach node i
    minTime = [[math.inf] * 2 for _ in range(n + 1)]
    minTime[1][0] = 0

    for u, v in edges:
      graph[u].append(v)
      graph[v].append(u)

    while q:
      i, prevTime = q.popleft()
      # start from green
      # if numChangeSignal is odd -> now red
      # if numChangeSignal is even -> now gree
      numChangeSignal = prevTime // change
      waitTime = change - (prevTime % change) if numChangeSignal & 1 else 0
      newTime = prevTime + waitTime + time
      for j in graph[i]:
        if newTime < minTime[j][0]:
          minTime[j][0] = newTime
          q.append((j, newTime))
        elif minTime[j][0] < newTime < minTime[j][1]:
          if j == n:
            return newTime
          minTime[j][1] = newTime
          q.append((j, newTime))
