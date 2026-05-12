import java.util.*;
class ArrayLearning{
    public static void main(String args[]){
        int[] arr = {1,24,45,3,2};
        System.out.println(Arrays.toString(arr));
        int check = arr[0];
        for(int nums:arr){
            if(nums>check){
                check=nums;
            }
        }
        System.out.println("The largest number in array is : "+check);
    }
}