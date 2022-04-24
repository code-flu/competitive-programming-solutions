import java.util.*;

public class CandidateCode {

  public static void main(String args[]) throws Exception {
    Scanner sc = new Scanner(System.in);
    int numberOfTests = sc.nextInt();
    String[] range = new String[numberOfTests];
    sc.nextLine();
    for (int i = 0; i < numberOfTests; i++) {
      range[i] = sc.nextLine();
    }
    for (int i = 0; i < range.length; i++) {
      int[] num = Arrays.stream(range[i].split(" ")).mapToInt(Integer::parseInt).toArray();
      int rightNum = 0, leftNum = 0;
      for (int n = num[0]; n <= num[1]; n++) {
        if (isPrime(n)) {
          rightNum = n;
          break;
        }
      }
      for (int n = num[1]; n >= num[0]; n--) {
        if (isPrime(n)) {
          leftNum = n;
          break;
        }
      }
      if (rightNum == 0 && leftNum == 0) {
        System.out.println("-1");
      } else if (rightNum == 0 || leftNum == 0 || rightNum - leftNum == 0) {
        System.out.println("0");
      } else {
        System.out.println(leftNum - rightNum);
      }
    }
  }

  public static boolean isPrime(int n) {
    if (n <= 1) return false;
    else if (n == 2) return true;
    else if (n % 2 == 0) return false;
    for (int i = 3; i <= Math.sqrt(n); i += 2) {
      if (n % i == 0) return false;
    }
    return true;
  }
}