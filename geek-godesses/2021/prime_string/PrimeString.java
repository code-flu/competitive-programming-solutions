import java.util.Scanner;

class CandidateCode {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      char[] chr = sc.next().toCharArray();
      int k = 0;
      int even = 0;
      int odd = 0;
      for (char c : chr) {
        if (k % 2 == 0) even += c;
        else odd += c;
        k += 1;
      }
      int diff = Math.abs(odd - even);
      if (diff % 3 == 0 || diff % 5 == 0 || diff % 7 == 0) System.out.println("Prime String");
      else System.out.println("Casual String");
    }
  }
}
