import java.util.Scanner;

public class CandidateCode {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int Q = scanner.nextInt();
    scanner.nextLine();
    String S = scanner.nextLine();
    int[] updates = new int[Q];
    for (int i = 0; i < Q; i++) {
      updates[i] = scanner.nextInt();
    }
    calculateDistances(N, Q, S, updates);
  }

  public static void calculateDistances(int N, int Q, String S, int[] updates) {
    for (int i = 0; i < Q; i++) {
      int index = updates[i] - 1;
      char updatedType = (S.charAt(index) == '0') ? '1' : '0';
      S = S.substring(0, index) + updatedType + S.substring(index + 1);
      int distance = calculateInitialDistance(S, N);
      System.out.println(distance);
    }
  }

  public static int calculateInitialDistance(String S, int N) {
    int distance = 0;
    for (int i = 1; i < N; i++) {
      if (S.charAt(i) == S.charAt(i - 1)) {
        distance += 2;
      } else {
        distance += 1;
      }
    }
    return distance;
  }
}