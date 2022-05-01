import java.util.*;

public class CandidateCode {
  public static void main(String args[]) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int[] tj = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
      System.out.println(find(tj, 1));
    }
  }

  static int find(int[] tj, int res) {
    for (int i = tj[2]; i > 0; ) {
      int t = i - tj[0];
      if (t > 0) {
        i = t + tj[1];
      } else break;
      res++;
    }
    return res;
  }
}
