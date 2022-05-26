class Solution:
  def maximumScore(self, scores: List[int], edges: List[List[int]]) -> int:
    n = len(scores)
    ans = -1
    graph = [[] for _ in range(n)]

    for u, v in edges:
      graph[u].append((scores[v], v))
      graph[v].append((scores[u], u))

    for i in range(n):
      graph[i] = heapq.nlargest(3, graph[i])

    for u, v in edges:
      for scoreA, a in graph[u]:
        for scoreB, b in graph[v]:
          if a != b and a != v and b != u:
            ans = max(ans, scoreA + scores[u] + scores[v] + scoreB)

    return ans
