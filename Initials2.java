import java.util.*;

public class Initials2 {
    public static void main(String[] args) {
        String names = "Anand Kumar Gupta,Vivek Kumar Pandey,Ashish Kumar Saini";
        String[] str = names.split(",");
        for (String i : str) {
            System.out.println(i);
        }
        // List<String> listOfNames = new ArrayList<String>(Arrays.asList(str));

    }
}
