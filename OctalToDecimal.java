import java.util.*;

public class OctalToDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int octal = sc.nextInt();
        int decimal = 0;
        int n = 0;
        while (octal != 0) {
            int t=octal%10;
           
            decimal=(int) (decimal+t*Math.pow(8,n));
            octal=octal/10;
            n++;
        
        }
        System.out.println(decimal);
        sc.close();
    }
}