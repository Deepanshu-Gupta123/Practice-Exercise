public class Vinnove {
    public static void main(String[] args) {
        String str = "zambia";
        String newS = "";
        int k=5;
        for(int i =0; i<str.length();i++){
            int val = str.charAt(i);
            int dup;
            if(val+k>122){
                 dup=k;
                dup=dup-(122-val);
                //dup=dup%26;
                dup=dup+96;
                newS+=(char)(dup);
            }
            else
            
                newS+=(char)(k+val);

        }
        System.out.println(str);
        System.out.println(newS);
    }
}
