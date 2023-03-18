import java.util.Scanner;

public class CandidateCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int maxSum = 0;
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }
            if (sum > maxSum || (sum == maxSum && i > maxIndex)) {
                maxSum = sum;
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }
}
