import java.util.*;
public class maxvalue {
    // static void printarr(int arr[],int idx){
    //      if(idx==arr.length){
    //         return;
    //     }
    //     System.out.print(arr[idx] + " ");
    //     printarr(arr, idx+1);
    // }

      static int maximum(int arr[], int idx ){
             if(idx==arr.length-1){
             return arr[idx];
        }
        int max = maximum(arr,idx+1);

        return Math.max(arr[idx], max);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int idx =0;
        int n = sc.nextInt();
        int a [] = new int[n];
        System.out.println("Enter elements  :");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("The max value of the array is :");
        //printarr(a, 0);
        System.out.println(maximum(a, idx));
    }    
}
