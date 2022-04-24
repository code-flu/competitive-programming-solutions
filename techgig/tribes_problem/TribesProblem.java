import java.util.Scanner;

public class CandidateCode {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useDelimiter("[\\s+]");
    int r = sc.nextInt();
    int s = sc.nextInt();
    int p = sc.nextInt();
    double[][][] f = new double[110][110][110];
    double sum;
    double[] ans = new double[3];
    f[r][s][p] = 1.0;

    for (int i = r; i >= 0; i--) {
      for (int j = s; j >= 0; j--) {
        for (int k = p; k >= 0; k--) {
          if (i != 0 || j != 0 || k != 0) {
            sum = i * j + j * k + k * i;
            if (k != 0) {
              f[i][j][k] += f[i + 1][j][k] * (double) ((i + 1) * k) / (sum + j + k);
            }
            if (i != 0) {
              f[i][j][k] += f[i][j + 1][k] * (double) ((j + 1) * i) / (sum + i + k);
            }
            if (j != 0) {
              f[i][j][k] += f[i][j][k + 1] * (double) ((k + 1) * j) / (sum + i + j);
            }
          }
        }
      }
    }
    for (int i = 1; i <= r; i++) {
      ans[0] += f[i][0][0];
    }
    for (int i = 1; i <= s; i++) {
      ans[1] += f[0][i][0];
    }
    for (int i = 1; i <= p; i++) {
      ans[2] += f[0][0][i];
    }
    for (int i = 0; i < 3; i++) {
      System.out.printf("%.5f ", ans[i]);
    }
    System.out.println("");
  }
}