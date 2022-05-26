class Solution {
  public int minSwaps(int[] data) {
    final int k = (int) Arrays.stream(data).filter(a -> a == 1).count();
    int ones = 1;    // ones in window
    int maxOnes = 0; // max ones in window

    for (int i = 0; i < data.length; ++i) {
      if (i >= k && data[i - k] == 1)
        --ones;
      if (data[i] == 1)
        ++ones;
      maxOnes = Math.max(maxOnes, ones);
    }

    return k - maxOnes;
  }
}
