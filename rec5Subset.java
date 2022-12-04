
import java.util.Stack;

public class rec5Subset {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2 };
        int n = 3;
        Stack<Integer> ds = new Stack<Integer>();
        rec(0, n, arr, ds);

    }

    private static void rec(int i, int n, int[] arr, Stack<Integer> ds) {
        if (i == n) {
            for (int z : ds) {
                System.out.print(z + " ");
            }

            if (ds.size() == 0) {
                System.out.print("{}");
            }
            System.out.println();
            return;
        }
        ds.push(arr[i]);
        rec(i + 1, n, arr, ds);
        ds.pop();
        rec(i + 1, n, arr, ds);
    }
}
