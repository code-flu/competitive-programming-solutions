import java.util.*;
public class CandidateCode {
  public static void main(String args[]) throws Exception {
    Scanner sc = new Scanner(System.in);
    final String virus = sc.next();
    final int numberOfComposition = sc.nextInt();
    final String[] compositions = new String[numberOfComposition];
    for (int i = 0; i < compositions.length; i++) {
      compositions[i] = sc.next();
    }
    for (int i = 0; i < compositions.length; i++) {
      String report = "POSITIVE";
      String sample = virus;
      for (Character chr : compositions[i].toCharArray()) {
        int isExist = sample.indexOf(chr);
        if (isExist < 0) {
          report = "NEGATIVE";
          break;
        }
        sample = sample.substring(isExist);
      }
      System.out.println(report);
    }
  }
}