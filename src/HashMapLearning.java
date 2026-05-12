import java.util.HashMap;

public class HashMapLearning{
    public static void main(String []args){
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Srinija", 22);
        map.put("Sanjeev", 21);
        map.put("Claude", 21);

        System.out.println(map.get("Srinija"));
        System.out.println(map.containsKey("Tony"));
        System.out.println(map.size());

    }
}