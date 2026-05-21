import java.util.Scanner;
public class FibonacciRecursion {

    static int recursion(int nums){
        if(nums <= 0){
            return 0;
        }
        if(nums ==1){
            return 1;
        }
        return recursion(nums-1) +recursion(nums-2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check its fibonacci series : ");
        int nums = sc.nextInt();
        System.out.println(recursion(nums));
    }
}
