import java.util.Scanner;
public class CandidateCode {
  static String HarryNum(char[] num, int k, int len) {
    if (len == 0 || k == 0) {
      return new String(num);
    }
    if (len == 1) return "1";
    if (num[0] != '1') {
      num[0] = '1';
      k--;
    }
    int i = 1;
    while (k > 0 && i < len) {
      if (num[i] != '0') {
        num[i] = '0';
        k--;
      }
      i++;
    }
    return new String(num);
  }

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String L = sc.next();
    int K = sc.nextInt();
    char[] arr = L.toCharArray();
    System.out.println(HarryNum(arr, K, N));
  }
}