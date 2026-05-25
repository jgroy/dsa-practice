import java.util.Collections;
import java.util.ArrayList;
public class CollectionsSort {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(9);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(5);

        System.out.println(list);
        Collections.sort(list);
        System.out.println("sorted list is "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
