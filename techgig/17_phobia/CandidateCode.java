import java.util.*;

public class CandidateCode {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String ans =  (n % 17 == 0)?"Panic Attack":(String.valueOf(n).contains("17")?"Panic Attack":"Happy Face");
            System.out.println(ans);
            --t;
        }
    }
}