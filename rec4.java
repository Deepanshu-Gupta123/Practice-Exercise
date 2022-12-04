public class rec4 {
    public static void main(String[] args) {
        System.out.println("Fibonacci is: " + fibo(4));
        sum(4, 0);
    }

    private static void sum(int i, int j) {
        if (i < 1) {
            System.out.println("The sum is: " + j);
            return;
        }
        sum(i - 1, j + i);

    }

    private static int fibo(int i) {
        if (i <= 1)
            return i;

        return fibo(i - 1) + fibo(i - 2);

    }
}
