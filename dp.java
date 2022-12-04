import java.util.Arrays;
import java.util.Scanner;

public class dp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Dp Step 1 : Make Array or ArrayList.
        int[] dp = new int[n + 1];
        System.out.println(f(n, dp));
        Arrays.fill(dp, -1);
        sc.close();
    }

    private static int f(int n, int[] dp) {

        if (n <= 1) {
            return n;
        }

        // Step 3 : Use Array.
        if (dp[n] != 0)
            return dp[n];

        // Step 2 : Store value in Array.
        return dp[n] = f(n - 1, dp) + f(n - 2, dp);

       
    }

}
