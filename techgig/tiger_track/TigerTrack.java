
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CandidateCode {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t>0){
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
          arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int res = 0;
        for(int j=0; j<n-1; j++){
          res += Math.abs(arr[j]-arr[j+1]);
        }
        System.out.println(res);

      --t;
    }
  }
}
