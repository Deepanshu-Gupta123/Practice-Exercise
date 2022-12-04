
// Java code for print number of Vowels in string.

public class practice2 {

    public static void main(String[] args) {
        String str = "gupta";
        int ct = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ct++;
            }
        }
            System.out.println("Total vowels are : "+ct);
    }
}
