import java.util.*;
class SortingAlgorithms{
    public static void main(String args[]){
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(arr));

        //Bubble Sort:
        //int temp =0;
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=0;j<arr.length-1-i;j++){
        //         if(arr[j]>arr[j+1]){
        //             temp = arr[j+1];
        //             arr[j+1]=arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }

        //Selection sort
        int small;
        for(int i=0;i<arr.length-1;i++){
            small = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[small]){
                    small =j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[small];
            arr[small]=temp;
        }
         System.out.println(Arrays.toString(arr));
    }
}