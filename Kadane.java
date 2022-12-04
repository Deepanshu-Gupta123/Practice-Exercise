public class Kadane {
    public static void main(String[] args) {
        int arr[] = { 1, 3, -2, -1, 6, -4, 3, 4, -5, 5, -2, 3, 3 };
        System.out.println(maxSumSubArray(arr));
    }

    private static int maxSumSubArray(int[] arr) {
        int currSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum <= 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }

}
