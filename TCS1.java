import java.util.HashSet;
import java.util.Scanner;

public class TCS1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            HashSet<Integer> s = new HashSet<Integer>();
            for (int j = 0; j < n; j++) {
                s.add(arr[j]);
            }
            for (int x : s) {
                System.out.print(x + " ");
            }
        }
        sc.close();
    }
}
