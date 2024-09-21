import java.util.*;
public class sum {
    static int sum(int arr[],int idx){
        if(idx==arr.length){
            return 0;
        }
        int subsum =sum(arr, idx+1);
        return arr[idx]+subsum ; 
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
        System.out.println("The sum of the array is :");
        //printarr(a, 0);
        System.out.println(sum(a, idx));
    }    
}
