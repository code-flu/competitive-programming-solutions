import java.util.*;

public class CandidateCode {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			StringBuilder num = new StringBuilder();
			while (n > 0) {
				String ticketNum = sc.next();
				num.append(ticketNum.charAt(ticketNum.length() - 1));
				--n;
			}
			if (isDivisibleBy5(num.toString())) {
				System.out.println("LUCKY");
			} else System.out.println("UNLUCKY");

			--t;
		}
	}

	static boolean isDivisibleBy5(String num) {
		int sz = num.length();
		int i = Integer.parseInt(num.substring(sz - 1));
		return ((i == 5) || (i == 0));
	}
}
