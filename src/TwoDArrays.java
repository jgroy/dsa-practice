public class TwoDArrays {
    public static void main(String args[]){
        int [][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int sum=0;
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                int element = arr[i][j];
                System.out.print(element + " ");
                sum+=element;
            }
            System.out.println();
        }
        System.out.println("The sum of elements in array is : "+sum);
        
        }
}
