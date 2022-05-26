class Solution {
 public:
  int minCostToSupplyWater(int n, vector<int>& wells,
                           vector<vector<int>>& pipes) {
    int ans = 0;
    using P = pair<int, int>;
    vector<vector<P>> graph(n + 1);
    priority_queue<P, vector<P>, greater<>> minHeap;  // (d, u)

    for (const auto& p : pipes) {
      const int u = p[0];
      const int v = p[1];
      const int w = p[2];
      graph[u].emplace_back(v, w);
      graph[v].emplace_back(u, w);
    }

    // connect virtual 0 with node 1 to n
    for (int i = 0; i < n; ++i) {
      graph[0].emplace_back(i + 1, wells[i]);
      minHeap.emplace(wells[i], i + 1);
    }

    unordered_set<int> mst{{0}};

    while (mst.size() < n + 1) {
      const auto [d, u] = minHeap.top();
      minHeap.pop();
      if (mst.count(u))
        continue;
      // adding the new vertex
      mst.insert(u);
      ans += d;
      // expand if possible
      for (const auto [v, w] : graph[u])
        if (!mst.count(v))
          minHeap.emplace(w, v);
    }

    return ans;
  }
};
