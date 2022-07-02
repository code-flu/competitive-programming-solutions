import java.util.Scanner;

public class CandidateCode {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

      double ans = (arr[1] * Math.pow(0, 2)) + (arr[2] * Math.pow(arr[0], 2));

      for (int i = 0; i <= arr[0]; i++) {
        double temp = (arr[1] * Math.pow(i, 2)) + (arr[2] * Math.pow((arr[0] - i), 2));
        if (temp <= ans) ans = temp;
        else {
          System.out.println((long) ans);
          break;
        }
      }
      --t;
    }
  }
}