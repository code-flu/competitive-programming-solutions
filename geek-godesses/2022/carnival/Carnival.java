import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CandidateCode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            ArrayList<Long> items = new ArrayList<>();
            while (n > 0) {
                items.add(sc.nextLong());
                --n;
            }
            --t;
            Collections.sort(items);
            long leftSum = items.subList(0, m).stream().mapToLong(i -> i).sum();
            long leftSum2 = items.subList(0, items.size() - m).stream().mapToLong(i -> i).sum();
            long rightSum = items.subList(0, items.size()).stream().mapToLong(i -> i).sum() - leftSum;
            long rightSum2 = items.subList(0, items.size()).stream().mapToLong(i -> i).sum() - leftSum2;
            long result = Math.max(Math.abs(rightSum2 - leftSum2), Math.abs(rightSum - leftSum));
            System.out.println(result);
        }
    }
}