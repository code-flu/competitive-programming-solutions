enum class Pos { HORIZONTAL, VERTICAL };

class Solution {
 public:
  int minimumMoves(vector<vector<int>>& grid) {
    const int n = grid.size();
    int ans = 0;
    // state of (x, y, pos)
    // pos := 0 (horizontal) / 1 (vertical)
    queue<tuple<int, int, Pos>> q{{{0, 0, Pos::HORIZONTAL}}};
    vector<vector<vector<bool>>> seen(n,
                                      vector<vector<bool>>(n, vector<bool>(2)));
    seen[0][0][static_cast<int>(Pos::HORIZONTAL)] = true;

    auto canMoveRight = [&](int x, int y, Pos pos) -> bool {
      if (pos == Pos::HORIZONTAL)
        return y + 2 < n && !grid[x][y + 2];
      return y + 1 < n && !grid[x][y + 1] && !grid[x + 1][y + 1];
    };

    auto canMoveDown = [&](int x, int y, Pos pos) -> bool {
      if (pos == Pos::VERTICAL)
        return x + 2 < n && !grid[x + 2][y];
      return x + 1 < n && !grid[x + 1][y] && !grid[x + 1][y + 1];
    };

    auto canRotateClockwise = [&](int x, int y, Pos pos) -> bool {
      return pos == Pos::HORIZONTAL && x + 1 < n && !grid[x + 1][y + 1] &&
             !grid[x + 1][y];
    };

    auto canRotateCounterclockwise = [&](int x, int y, Pos pos) -> bool {
      return pos == Pos::VERTICAL && y + 1 < n && !grid[x + 1][y + 1] &&
             !grid[x][y + 1];
    };

    while (!q.empty()) {
      for (int sz = q.size(); sz > 0; --sz) {
        const auto [x, y, pos] = q.front();
        q.pop();
        if (x == n - 1 && y == n - 2 && pos == Pos::HORIZONTAL)
          return ans;
        if (canMoveRight(x, y, pos) && !seen[x][y + 1][static_cast<int>(pos)]) {
          q.emplace(x, y + 1, pos);
          seen[x][y + 1][static_cast<int>(pos)] = true;
        }
        if (canMoveDown(x, y, pos) && !seen[x + 1][y][static_cast<int>(pos)]) {
          q.emplace(x + 1, y, pos);
          seen[x + 1][y][static_cast<int>(pos)] = true;
        }
        const Pos newPos =
            pos == Pos::HORIZONTAL ? Pos::VERTICAL : Pos::HORIZONTAL;
        if ((canRotateClockwise(x, y, pos) ||
             canRotateCounterclockwise(x, y, pos)) &&
            !seen[x][y][static_cast<int>(newPos)]) {
          q.emplace(x, y, newPos);
          seen[x][y][static_cast<int>(newPos)] = true;
        }
      }
      ++ans;
    }

    return -1;
  }
};
