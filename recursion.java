
public class recursion {
    public static void main(String[] args) {
        func(1, 3);
    }
    // One way
    // private static void func(int n) {

    // if (n == 0) {
    // return;
    // }
    // System.out.println("Dishu");
    // n--;
    // func(n);
    // }
    private static void func(int i, int n) {
        if (i > n)
            return;
        System.out.println("Dishu");
        func(i + 1, n);
    }
}