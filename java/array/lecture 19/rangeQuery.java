import java.util.*;
public class rangeQuery{
    
    static int[] makeprefixsum(int arr[]){
        for(int i=1; i<arr.length; i++){
            arr[i]+= arr[i-1];
        }
        return arr;
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
        int arr[]= new int[n+1];

        System.out.println("Enter " + n+ " Elements:");
        for(int i=1; i<=n; i++){
            arr[i]=sc.nextInt();
        }
        // System.out.println("original array is :");
        // printarray(arr);

        int [] prefsum= makeprefixsum(arr);

        System.out.println("Enter number of queries: ");
        int q = sc.nextInt();
        while(q-->0){
            System.out.println("Enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = prefsum[r]-prefsum[l-1];
            System.out.println("sum = " + ans);
        }
    }
}