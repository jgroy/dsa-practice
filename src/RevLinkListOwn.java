class Nodes1{
    int data;
    Nodes1 next;

    Nodes1(int data){
        this.data=data;
        this.next = null;
    }
}
class RevLinkListOwn{
    Nodes1 head;

    void add(int data){
        Nodes1 newnode=new Nodes1(data);
        if(head==null){
            head =newnode;
            return ;
        }
        Nodes1 current = head;
        while(current.next!=null){
            current=current.next;
        }
        current.next = newnode;
    }
    void print(){
        Nodes1 current = head;
        while(current!=null){
            System.out.print(current.data +" -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    Nodes1 reverse(){
        Nodes1 prev = null;
        Nodes1 current = head;
        Nodes1 nextnode;
        while(current!=null){
            nextnode= current.next;
            current.next=prev;
            prev = current;
            current = nextnode;
        }
        return prev;
    }
    public static void main(String args[]){
        RevLinkListOwn obj = new RevLinkListOwn();

        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);

        obj.print();

        obj.head = obj.reverse();
        obj.print();
    }
}