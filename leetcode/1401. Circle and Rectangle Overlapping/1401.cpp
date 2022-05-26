class Solution {
 public:
  bool checkOverlap(int radius, int x_center, int y_center, int x1, int y1,
                    int x2, int y2) {
    auto clamp = [&](int center, int mini, int maxi) {
      return max(mini, min(maxi, center));
    };

    // the closest point to the circle within the rectangle
    int closestX = clamp(x_center, x1, x2);
    int closestY = clamp(y_center, y1, y2);

    // the distance between the circle's center and this closest point
    int distanceX = x_center - closestX;
    int distanceY = y_center - closestY;

    // if the distance is less than the circle's radius, an intersection occurs
    return (distanceX * distanceX) + (distanceY * distanceY) <=
           (radius * radius);
  }
};
