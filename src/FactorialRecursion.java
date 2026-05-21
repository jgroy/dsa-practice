class FactorialRecursion{

    static int Factorial(int num){
        if(num <1){
            return 1;
        }
        return num *Factorial(num-1);
    }
    public static void main(String args[]){

        System.out.println("the factorial is : " +Factorial(5));

    }
}   