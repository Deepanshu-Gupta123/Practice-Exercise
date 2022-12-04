import java.util.Arrays;

public class practice3 {
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "gramana";
        char str3[] = str1.toCharArray();
        char str4[] = str2.toCharArray();
        Arrays.sort(str3);
        Arrays.sort(str4);
        String s1 = new String(str3);
        String s2 = new String(str4);
        if (s1.equals(s2)) {
            System.out.println("Anagram");
        } else
            System.out.println("Not Anagram");
    }
}
