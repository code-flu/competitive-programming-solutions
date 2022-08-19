import java.util.*;

public class CandidateCode {
  static Location manager;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();

    List<Location> vacant = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      String row = sc.nextLine().replace(" ", "");
      if (row.contains("M")) {
        manager = new Location(i, row.indexOf('M'));
      }
      for (int j = 0; j < 8; j++) {
        if (row.charAt(j) == 'V') vacant.add(new Location(i, j));
      }
    }

    int ans = n + 1;
    do {
      int temp = 0;
      Location closestVacantRow =
          vacant.stream().min(Comparator.comparingInt(v -> Math.abs(v.row - manager.row))).get();
      if (closestVacantRow.col > 3 && manager.col > 3 && closestVacantRow.row == manager.row) {
        ans = 0;
        break;
      } else if (closestVacantRow.col < 4 && manager.col > 3) {
        temp += Math.abs(manager.row - closestVacantRow.row) + 2;
      } else if (closestVacantRow.col > 3 && manager.col < 4) {
        temp += Math.abs(closestVacantRow.row - manager.row) + 2;
      } else {
        temp += Math.abs(manager.row - closestVacantRow.row);
      }
      if (temp < ans) {
        ans = temp;
      }
      vacant.remove(closestVacantRow);
    } while (vacant.size() > 0);
    System.out.println(ans);
  }

  static class Location {
    int row;
    int col;

    public Location(int row, int col) {
      this.row = row;
      this.col = col;
    }
  }
}
