import java.util.Stack;

public class rec6 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        Stack<Integer> ds = new Stack<>();
        int n = arr.length, sum = 2, s = 0;

        SeqSum(0, arr, sum, s, ds, n);
    }

    private static void SeqSum(int i, int[] arr, int sum, int s, Stack<Integer> ds, int n) {
        if (i == n) {
            if (s >= sum) {
                for (int z : ds) {
                    System.out.print(z + " ");
                    
                }

                return;
            }
        }
        ds.push(arr[i]);
        s += arr[i];
         SeqSum(i + 1, arr, sum, s + arr[i], ds, n);

        s -= arr[i];
        ds.pop();
         SeqSum(i + 1, arr, sum, s, ds, n);
    

    }

}
