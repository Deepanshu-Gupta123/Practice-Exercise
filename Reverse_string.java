

public class Reverse_string {
    public static void main(String[] args) {
        String s = "deepanshu gupta";
        System.out.println(s);

        String strArray[] = s.split(" ");

        for (int j = 0; j < strArray.length; j++) {
            String nstr = "";
            char ch;
            for (int i = 0; i < strArray[j].length(); i++) {
                ch = strArray[j].charAt(i);
                nstr = ch + nstr;
            }
            System.out.print(nstr + " ");
        }

        // for(int i =0;i<strArray.length;i++){
        // System.out.println(strArray[i]);}

    }
}
