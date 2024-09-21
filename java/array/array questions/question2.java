import java.util.*;

public class question2 {

    static int pairelements(int arr[], int target){
        int n = arr.length;
        int ans = 0;
        for(int i =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]+arr[j]==target)
                ans++;
            }
        }
        return ans ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter sum target:");
        int target = sc.nextInt();

        System.out.println("answer is "+ pairelements(arr, target));
    }
    
}
