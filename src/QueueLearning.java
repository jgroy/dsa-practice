import java.util.LinkedList;
import java.util.Queue;

class QueueLearning{
    public static void main(String args[]){
        Queue<String> obj = new LinkedList<>();

        obj.add("Jefferson");
        obj.add("Srinija");
        obj.add("Sanjeev");

        while(obj.isEmpty()==false){
            System.out.println(obj.poll()+" is served.");
        }
    }
}