import java.util.*;

public class practice01 {
    public static void main(String[] args) {
        String str = "CampusMonk", res = "";

        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                res += str.toLowerCase();
            } else
                res += str.toUpperCase();
        }
        System.out.println(str);
    }

}