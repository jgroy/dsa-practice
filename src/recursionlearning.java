class recursionlearning{

void countdown(int n){
    if(n==0){
        System.out.println(n);
        return;
    }
    System.out.println(n);
    countdown(n-1);
}

public static void main(String args[]){
    recursionlearning obj = new recursionlearning();
    obj.countdown(5);
}

}