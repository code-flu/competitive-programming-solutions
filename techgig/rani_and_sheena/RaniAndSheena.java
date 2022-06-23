import java.util.Scanner;
public class CandidateCode {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      int a = sc.nextInt();
      int n = sc.nextInt();
      int[] items = new int[n];
      for(int i=0; i<n; i++){
        items[i] = sc.nextInt();
      }
      for(int i=0; i<n-1; i++){
        for(int j=i+1; j<n; j++){
          if(items[i]+items[j]==a)
            System.out.println((i+1)+" "+(j+1));
        }
      }
      --t;
    }
  }
}