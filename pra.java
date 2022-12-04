public class pra {
    

        static void factorial(int n) {
            for (int i = 2; i <= n; ) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                    n = n / i;
                }
                else i++;
    
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            int[] digit = { 11, 13, 12, 15, 65, 76, 21, 98, 76 };
            for (int i = 0; i < digit.length; i++) {
                factorial(digit[i]);
            }
        }
    }



