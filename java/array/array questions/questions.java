import java.util.*;

public class questions {
    

    static int[] smallestandlargest(int arr[]){
        Arrays.sort(arr);
        int ans[]={arr[0], arr[arr.length-1]};
        return ans;
        
    }

    static int lastoccurance(int arr[], int x){
        int a=-1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==x)
            a=i;

        }
        return a ;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        // System.out.println("Enter the element x:");
        // int x = sc.nextInt();
        // System.out.println("The element is found at "+lastoccurance(arr, x)+" at last time");
        // System.out.println("sorted array is:");
        int[] ans = smallestandlargest(arr);
        System.out.println("Smallest element = "+ans[0]);
        System.out.println("Largest Element = "+ ans[1]);
    }
    
}
