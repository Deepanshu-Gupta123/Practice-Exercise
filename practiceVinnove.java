
public class practiceVinnove {
    static void factorial(int n) {
        for (int i = 1; i < n; i++) {
            if (n / i == 0) {
                System.out.println(i + " ");
                n = n / i;
            }

        }

    }

    public static void main(String[] args) {
        int[] digit = { 11, 13, 12, 15, 65, 76, 21, 98, 76 };
        for (int i = 0; i < digit.length; i++) {
            factorial(digit[i]);
        }
    }
}