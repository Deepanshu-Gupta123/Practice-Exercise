import java.util.Stack;

public class recOneSeqSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        Stack<Integer> ds = new Stack<>();
        int n = arr.length, sum = 2, s = 0;

        OneSeqSum(0, arr, sum, s, ds, n);
    }

    private static boolean OneSeqSum(int i, int[] arr, int sum, int s, Stack<Integer> ds, int n) {
        if (i == n) {
            if (s == sum) {
                for (int z : ds) {
                    System.out.print(z + " ");

                }
                return true;

            } else
                return false;
        }
        ds.push(arr[i]);
        //s += arr[i];
        if (OneSeqSum(i + 1, arr, sum, s+arr[i], ds, n) == true) {
            return true;
        }

        ds.pop();
        //s -= arr[i];
        if (OneSeqSum(i + 1, arr, sum, s, ds, n) == true) {
            return true;
        }
        return false;

    }

}