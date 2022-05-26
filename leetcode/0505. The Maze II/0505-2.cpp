class Solution {
 public:
  int shortestDistance(vector<vector<int>>& maze, vector<int>& start,
                       vector<int>& destination) {
    vector<vector<int>> dist(maze.size(), vector<int>(maze[0].size(), INT_MAX));
    dist[start[0]][start[1]] = 0;

    dfs(maze, dist, start[0], start[1], destination);

    return dist[destination[0]][destination[1]] == INT_MAX
               ? -1
               : dist[destination[0]][destination[1]];
  }

 private:
  const vector<int> dirs{0, 1, 0, -1, 0};

  void dfs(vector<vector<int>>& maze, vector<vector<int>>& dist, int i, int j,
           const vector<int>& destination) {
    if (i == destination[0] && j == destination[1])
      return;

    for (int k = 0; k < 4; ++k) {
      int x = i;
      int y = j;
      int steps = dist[i][j];
      while (isValid(maze, x + dirs[k], y + dirs[k + 1])) {
        x += dirs[k];
        y += dirs[k + 1];
        ++steps;
      }
      if (steps < dist[x][y]) {
        dist[x][y] = steps;
        dfs(maze, dist, x, y, destination);
      }
    }
  }

  bool isValid(const vector<vector<int>>& maze, int x, int y) {
    return x >= 0 && x < maze.size() && y >= 0 && y < maze[0].size() &&
           maze[x][y] == 0;
  }
};
