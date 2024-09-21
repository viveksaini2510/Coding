// this code is wrong:
import java.util.Arrays;
import java.util.*;
public class reverse {
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
        System.out.println("Original array is :");
        printarray(arr);
        Arrays.sort(arr);
        System.out.println("Sorted array is :");
        printarray(arr);
        for(int i= n-1; i>=0;i--){
            Arrays.sort(arr);
        }
        System.out.println("Reverse of sorted array:");
        printarray(arr);

    }
}
