// JAVA SOLUTION - 1 (passed all test cases)
import java.util.*;

public class CandidateCode {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[4];
    arr[0] = sc.nextInt(); // departure time hh
    arr[1] = sc.nextInt(); // departure time mm
    arr[2] = sc.nextInt(); // travel time hh
    arr[3] = sc.nextInt(); // travel time mm

    float totalMinutesOfTravel = (arr[2] * 60) + arr[3];

    for (float i = 1; i <= totalMinutesOfTravel; i++) {
      arr[1] += 1;
      if (arr[1] > 59) {
        arr[1] = 0;
        arr[0] += 1;
        if (arr[0] > 23) {
          arr[0] = 0;
        }
      }
    }
    System.out.println(String.format("%02d", arr[0]) + " " + String.format("%02d", arr[1]));
  }
}


// JAVA SOLUTION - 2 (passed all test cases)
import java.util.Scanner;

public class CandidateCode {

  public static void main(String args[]) throws Exception {

    Scanner scanner = new Scanner(System.in);

    // reading launch hour and minute
    int launch_hh = scanner.nextInt();
    int launch_min = scanner.nextInt();

    // reading travel time and adding it to launch hour and minute
    launch_hh += scanner.nextInt();
    launch_min += scanner.nextInt();

    if (launch_hh >= 24) {
      launch_hh = launch_hh % 24;
    }

    if (launch_min >= 60) {
      int count = launch_min / 60;
      launch_min = launch_min % 60;
      launch_hh += count;
      launch_hh = launch_hh % 24;
    }

    System.out.printf("%02d %02d", launch_hh, launch_min);

    scanner.close();
  }
}
