import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CandidateCode {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      String str = sc.next();
      Map<Character, Long> charFrequency =
          str.chars()
              .mapToObj(c -> (char) c)
              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
      char max = str.charAt(0);
      for (Character key : charFrequency.keySet()) // 5
      {
        if (charFrequency.get(key) > charFrequency.get(max)) max = key;
      }
      System.out.println(max);
    }
  }
}
