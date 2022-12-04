// Java code for String Palindrome

public class Practice {
    public static void main(String[] args) {
        String str = "khf";
        String rev = "";
        int n = str.length();
        for (int i = n - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            rev += ch;
        }
        System.out.println(str);
        System.out.println(rev);
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else
            System.out.println("Not Palindrome");

    }
}