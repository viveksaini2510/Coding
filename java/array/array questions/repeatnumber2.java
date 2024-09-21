import java.util.Scanner;
public class repeatnumber2 {
    static int firstrepeatnumber(int arr[]){
        int n = arr.length;
        int ans = -1;
        for(int i=n-1; i>0 ; i--){
            for (int j=n-2; j>0; j--){
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
