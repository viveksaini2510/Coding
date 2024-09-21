import java.util.Scanner;

public class subsetsum {


    static void subsetsum(int a[], int n,int idx, int sum){
        if (idx>=n){
            System.out.println(sum);
            return;
        }
        subsetsum(a, n, idx+1, sum+a[idx]);
        subsetsum(a, n, idx+1, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        int n = sc.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter array elements:");
        for(int i=0;  i <n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The sum of subsets are:");
        subsetsum(arr, n, 0, 0);
        
    }
    
}
