class Stack{
    int[] arr = new int[100];
    int top=-1;

    void push(int data){
        top++;
        arr[top]=data;
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }
    int peek(){
        return arr[top];
    }
    boolean isEmpty(){
    return top == -1;
    }
    public static void main(String args[]){
    Stack s = new Stack();
    
    s.push(10);
    s.push(20);
    s.push(30);
    
    System.out.println("Top: " + s.peek());
    System.out.println("Popped: " + s.pop());
    System.out.println("Top after pop: " + s.peek());
    System.out.println("Is empty: " + s.isEmpty());
}

}
