import java.util.*;
public class time35 {

    static void sortarraysquares(int arr[]){
        for(int i =0 ; i<arr.length; i++){
            for(int j = i+1; j<arr.length ; j++){
                if(arr[i]>= arr[j]){
                    swap(arr, i, j);
                }
            }
        }
    }

    static void squiringArrayElements(int arr[]){
        int n = arr.length;
        for(int i = 0; i <n ;i++){
            arr[i]=arr[i]*arr[i];
           
        }
         sortarraysquares(arr);
    }

    static void printarray(int [] arr){
        int n = arr.length;
        for(int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int arr[]= new int[n];

        System.out.println("Enter " + n+ " Elements:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("original array is :");
        printarray(arr);

        System.out.println("square of elements in non-descending order: ");
        squiringArrayElements(arr);
        printarray(arr);
    }
    
}
