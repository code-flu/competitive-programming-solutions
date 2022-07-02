import java.util.*;

public class CandidateCode {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int i = 1;
    int ans = 1;
    while (ans <= n) {
      String str = String.valueOf(i);
      if (!str.contains("2") && !str.contains("14")) {
        ans++;
      }
      i++;
    }
    System.out.println(i - 1);
  }
}