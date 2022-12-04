public class initial {
    public static void main(String[] args) {
        String str = "Anand kumar Gupta";
        String[] name = str.split(" ");
        int n = name.length;
        for(int i = 0;i<n;i++){
            if(i==(n-1)){
                System.out.println(" "+name[i]);
                break;
            }
            String str2= name[i];
            System.out.print(Character.toUpperCase(str2.charAt(0))+".");
            
        }
    }

}
