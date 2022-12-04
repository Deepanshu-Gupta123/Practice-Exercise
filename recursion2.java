import java.util.*;;
public class recursion2 {
    public static void main(String[] args) {
        int n = 3;
        func(1, n);
    }

    private static void func(int i,int j) {
        if(i>j) return;
        
        func(i+1,j);
        System.out.println(i);
    }
}
