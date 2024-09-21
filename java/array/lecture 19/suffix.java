import java.util.*;
public class suffix {

    static int totalsum(int arr[]){
        int total =0;
        int n = arr.length;
        for(int i =0 ; i<n ; i++){
            total += arr[i];
        }
        return total;
    }

    static void prefixsum(int arr[]){
        int n= arr.length;
        for(int i = 1; i<n; i++){
            arr[i]+=arr[i-1];
        }
    }

    static void suffixsum(int arr[]){
        int n = arr.length;
        for(int i = n-2; i>=0;i--){
            arr[i]+=arr[i+1];
            
        }
        
    }

    // static void suffixsum(int arr[]){
    //     int total = totalsum(arr);
    //     int prefix[] = prefixsum(arr);
    //     int suffix = new int[n];
    //     for(int i = 0; i<n ; i++){
    //         suffix[i] = total - prefix[i];
    //     }
    // }

    static void printarray(int arr[]){
        int n = arr.length;
        for(int i=0; i<n ; i++){

            System.out.print(arr[i]+" ");
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
        System.out.println("total sum is :");
        //suffixsum(arr);
        System.out.println(totalsum(arr));

        // System.out.println("Prefix sum is :");
        // prefixsum(arr);
        // printarray(arr);

        System.out.println("suffix sum array is: ");
        suffixsum(arr);
        printarray(arr);
    }
}