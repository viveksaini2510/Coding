import java.util.*;
public class linearsearch{

    static boolean search(int arr[], int n, int target ,int idx){
        if(idx>=n){
            return false;
        }
        if(arr[idx]==target){
            return true;
        }
      return search(arr, n, target, idx+1);
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
        System.out.println("Enter x:");
        int x = sc.nextInt();
        if(search(a,a.length, x, idx)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }    
}