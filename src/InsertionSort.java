import java.util.*;
public class InsertionSort {
    
    void insertion(int arr[]){
        int temp;
        for(int i=1;i<arr.length;i++){
            temp =arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp ){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String args[]){
        int arr[] ={10,9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        InsertionSort obj = new InsertionSort();
        obj.insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
