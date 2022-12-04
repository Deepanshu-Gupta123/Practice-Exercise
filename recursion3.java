public class recursion3 {
    public static void main(String[] args) {
        System.out.println(sum(3)); 
        System.out.println(fact(3));
    }
    public static int sum(int i){
        if(i==0) return 0;
        return i+sum(i-1);
        
    }
    public static int fact(int i){
        if(i==0) return 1;
        return i*sum(i-1);
    }
}
