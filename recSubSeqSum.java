import java.util.Stack;

public class recSubSeqSum {
    public static void main(String[] args) {
        int[] arr = { 4,5,9,2,5,3,6};
        Stack<Integer> ds = new Stack<>();
        int n = arr.length, sum = 21, s = 0;

        SeqSum(0, arr, sum, s, ds, n);
    }

    private static void SeqSum(int i, int[] arr, int sum, int s, Stack<Integer> ds, int n) {
        if (i == n) {
            if (s == sum) {
                for (int z : ds) {
                    System.out.print(z + " ");

                }
                System.out.println();

            }
            return;
        }
        ds.push(arr[i]);
        s += arr[i];
        SeqSum(i + 1, arr, sum, s, ds, n);

        ds.pop();
        s -= arr[i];
        SeqSum(i + 1, arr, sum, s, ds, n);

    }

}