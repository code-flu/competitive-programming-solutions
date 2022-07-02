import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CandidateCode {

  public static void main(String[] args) throws IOException {
    int n = 0;
    int[] inputs = new int[3];

    BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

    for (String str : bi.readLine().split("\\s")) {
      inputs[n] = Integer.parseInt(str);
      ++n;
    }
    Map<Integer, Boolean> seats = new HashMap<>();
    while (inputs[1] > 0) {
      try {
        seats.put(Integer.parseInt(bi.readLine()), true);
      } catch (Exception ex) {
        continue;
      }
      --inputs[1];
    }
    while (inputs[2] > 0) {
      try {
        System.out.println(seats.getOrDefault(Integer.parseInt(bi.readLine()), false) ? "N" : "Y");
      } catch (Exception ex) {
        System.out.println("Y");
      }
      --inputs[2];
    }
  }
}