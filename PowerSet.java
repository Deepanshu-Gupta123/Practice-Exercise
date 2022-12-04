import java.util.*;

public class PowerSet {
    public static void main(String[] args) {
        String str = "abc";
        int n = str.length();
        String[] s = new String[1 << n];
        for (int i = 0; i < (1 << n); i++) {
            String str2 = "";
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) <= 0) {
                    char c = str.charAt(j);
                    str2 += c;
                }

            }
            s[i] = str2;
        }
        Arrays.sort(s);
        for (String string : s) {
            System.out.print(string+" ");
        }

    }
}
