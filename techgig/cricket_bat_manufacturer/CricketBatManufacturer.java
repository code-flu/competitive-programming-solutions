import java.util.*;

public class CandidateCode {

  static Scanner sc = new Scanner(System.in);
  static final int r = sc.nextInt();
  static final int b = sc.nextInt();

  public static void main(String[] args) {
    boolean[][] bpGraph = new boolean[r][b];
    long[][] req = new long[r][2];
    long[][] bat = new long[b][2];

    for (int i = 0; i < r; i++) {
      req[i][0] = sc.nextLong();
      req[i][1] = sc.nextLong();
    }
    for (int i = 0; i < b; i++) {
      bat[i][0] = sc.nextLong();
      bat[i][1] = sc.nextLong();
    }
    for (int p = 0; p < r; p++) {
      for (int q = 0; q < b; q++) {
        bpGraph[p][q] = req[p][0] < bat[q][0] && req[p][1] >= bat[q][1];
      }
    }
    System.out.print(maxBPM(bpGraph));
  }

  static int maxBPM(boolean[][] bpGraph) {
    int[] matchR = new int[b];
    for (int i = 0; i < b; ++i) matchR[i] = -1;
    int result = 0;
    for (int u = 0; u < r; u++) {
      boolean[] seen = new boolean[b];
      for (int i = 0; i < b; ++i) seen[i] = false;

      if (bpm(bpGraph, u, seen, matchR)) result++;
    }
    return result;
  }

  static boolean bpm(boolean[][] bpGraph, int u, boolean[] seen, int[] matchR) {
    for (int v = 0; v < b; v++) {
      if (bpGraph[u][v] && !seen[v]) {
        seen[v] = true;
        if (matchR[v] < 0 || bpm(bpGraph, matchR[v], seen, matchR)) {
          matchR[v] = u;
          return true;
        }
      }
    }
    return false;
  }
}
