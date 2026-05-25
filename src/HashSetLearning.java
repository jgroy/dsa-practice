import java.util.HashSet;
public class HashSetLearning {
    public static void main(String args[]){
            HashSet<String> obj = new HashSet<>();
            
            obj.add("Srinija");
            obj.add("Jefferson");
            obj.add("(JeffersonSrinija)");
            obj.add("Jefferson");
            obj.add("Sanjjev");

            System.out.println(obj);
            System.out.println(obj.size());
            obj.remove("Sanjjev");
            System.out.println(obj.size());
            System.out.println(obj);
            System.out.println("does it contains(JeffersonSrinija = "+obj.contains("(JeffersonSrinija)"));
    }
}
