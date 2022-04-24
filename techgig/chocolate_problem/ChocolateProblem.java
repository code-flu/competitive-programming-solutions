import java.util.Scanner;

class CandidateCode {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long[] p = new long[sc.nextInt()];
    for (int q = 0; q < p.length; q++) {
      p[q] = sc.nextLong();
    }
    for (long l : p) {
      long q = l;
      if (q == 1) q = 2;
      long a = (q / 2);
      for (long i = 2; i < q; i++) {
        a += i;
      }
      System.out.println(a);
    }
  }
}