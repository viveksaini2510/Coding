import java.util.*;
public class max {
    static void printarr(int arr[],int idx){
         if(idx==arr.length){
            return;
        }
        System.out.print(arr[idx] + " ");
        printarr(arr, idx+1);
        
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = sc.nextInt();
        int a [] = new int[n];
        System.out.println("Enter elements  :");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("The array is :");
        printarr(a, 0);

    }

    
}