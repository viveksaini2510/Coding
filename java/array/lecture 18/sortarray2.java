import java.util.*;

public class sortarray2 {

    static void sort0and1(int arr[]){
        int n = arr.length;
        int left=0;
        int right = n-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            
            if(arr[right]==1){
                right--;
            }
        }
    }

    static void printarray(int [] arr){
        int n = arr.length;
        for(int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
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
        sort0and1(arr);
        System.out.println("The sorted array is :");
        printarray(arr);
    }
}
