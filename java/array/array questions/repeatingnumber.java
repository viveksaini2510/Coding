import java.util.Scanner;

public class repeatingnumber {

    static int firstrepeatnumber(int arr[]){
        int n = arr.length;
        int ans = -1;
        for(int i=0; i<n ; i++){
            for (int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                return arr[i];
                }
                
            }
            
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("The first repeating number is: " + firstrepeatnumber(arr) );

    }
}
