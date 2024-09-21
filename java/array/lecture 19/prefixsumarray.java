import java.util.*;

public class prefixsumarray {

    //code by me

    // static void prefixsum(int arr[]){
    //     int n = arr.length;
    //     for(int i =0;i<n; i++){
    //        if(i==0){
    //         arr[i] = arr[i];
    //        }
    //        else{
    //         arr[i]= arr[i]+arr[i-1];
    //        }
    //     }
    // }
    

    static void prefixsum(int arr[]){
        int n = arr.length;
        for(int i =1;i<n; i++){
           arr[i]+=arr[i-1];
        }
    }

 
    static void printarray(int [] arr){
        int n = arr.length;
        for(int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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

        System.out.println("array with prefix sum is:");
        prefixsum(arr);
        printarray(arr);
    }
}
