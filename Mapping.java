import java.util.*;

public class Mapping {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        map.put("d", 40);
        map.put("e", 50);
        System.out.println("Size of map is:- "+ map.size());
        System.out.println(map);

        if(map.containsKey("a")){
            int a = map.get("a"); 

        }
        
    }
}
