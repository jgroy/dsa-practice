class Nodes{
    int data;
    Nodes next;

    Nodes(int data){

        this.data= data;
        this.next=null;

}
}
class LinkedList{
    Nodes head;

    void add(int data){
        Nodes newnode = new Nodes(data);

        if(head == null){
            head = newnode;
            return;
        }
        Nodes current =head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = newnode;


    }
    void print(){
        Nodes current=head;
        while(current!=null){
            System.out.print(current.data+" -> ");
            current= current.next;
        }
        System.out.println("null");
    }

public static void main(String args[]){
    LinkedList llobj = new LinkedList();
    llobj.add(1);
    llobj.add(2);
    llobj.add(3);
    llobj.add(4);
    llobj.add(5);

    llobj.print();
    
}
}