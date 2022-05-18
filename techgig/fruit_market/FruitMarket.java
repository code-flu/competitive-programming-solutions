import java.util.Arrays;
import java.util.Scanner;

public class CandidateCode {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] quan = new int[n];
    while (n > 0) {
      quan[n - 1] = sc.nextInt();
      --n;
    }
    Arrays.sort(quan);

    int q = sc.nextInt();
    for (int i = 0; i < q; i++) {
      long k = sc.nextLong();
      int totalQuantitiesOfAllStalls = Arrays.stream(quan).sum();

      if (totalQuantitiesOfAllStalls < k) {
        System.out.println(-1);
        continue;
      }

      for (int j = 0; j < quan.length; j++) {
        long t = ((long) quan[j] * (quan.length - j));
        if (t < k) {
          k -= quan[j];
        } else if (t > k) {
          long x = k / (quan.length - j);
          if ((x * (quan.length - j)) < k) {
            System.out.println(x + 1);
            break;
          } else {
            System.out.println(x);
            break;
          }
        } else {
          System.out.println(quan[j]);
          break;
        }
      }
    }
  }
}
