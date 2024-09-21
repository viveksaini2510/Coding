import java.util.*;
public class sortarray{
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

    static void sortzerosandones(int[] arr){
        int n=arr.length;
        int zeros = 0 ;
        // count the number of zeroes
        for(int i =0; i<n; i++){
            if(arr[i]==0){
                zeros++;
            }
        }
        for(int i=0 ; i<n ; i++){
            if(i<zeros){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
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
        sortzerosandones(arr);

        
        System.out.println("The sorted array is: ");
        printarray(arr);
    }
}