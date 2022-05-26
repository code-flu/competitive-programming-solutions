import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CandidateCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			Integer[] tops = new Integer[n];
			int[] skirts = new int[n];
			for (int i = 0; i < n; i++) {
				tops[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				skirts[i] = sc.nextInt();
			}
			Arrays.sort(tops, Collections.reverseOrder());
			Arrays.sort(skirts);
			long totalBudget = 0L;
			boolean b = true;
			for (int i = 0; i < n; i++) {
				totalBudget += (long) tops[i] * skirts[i];
				System.out.println(tops[i] + "*" + skirts[i] + "=>" + totalBudget);
				if (totalBudget > m) {
					b = false;
					System.out.println("NO");
					break;
				}
			}
			if (b) {
				System.out.println("YES");
			}

			--t;
		}
	}
}
