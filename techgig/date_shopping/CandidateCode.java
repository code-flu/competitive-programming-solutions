import java.util.Scanner;

class CandidateCode {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int[] jeans = new int[sc.nextInt()];
        int[] shirts = new int[sc.nextInt()];
        for (int i = 0; i < jeans.length; i++) {
            jeans[i] = sc.nextInt();
        }
        for (int i = 0; i < shirts.length; i++) {
            shirts[i] = sc.nextInt();
        }
        int k = 0;
        int mn = 0;
        int pre = -1;
        int flag = 0;
        for (int j : jeans) {
            for (int shirt : shirts) {
                int s = j + shirt;
                if (s <= b && flag == 0) {
                    pre = s;
                    flag = 1;
                } else if (s <= b) {
                    mn = s;
                    if (mn > pre) {
                        pre = mn;
                    }
                }
                k = k + 1;
            }
        }
        System.out.println(pre);
    }
}