public class StringLearning {
    public static void main(String args[]){
        String name = "Jefferson";
        System.out.println(name);
        System.out.println(name.substring(0,4));
        System.out.println("Checking if name starts with \"Jeff\" :" + name.startsWith("Jeff"));
        System.out.println(name.replace("son","!!!"));
    }
    
}
