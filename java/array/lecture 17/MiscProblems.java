import java.util.*;
public class MiscProblems {

    static void swap(int a , int b){        

        int temp =a;
        a=b;
        b=temp;
        System.out.println("The value after swapping is: ");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    // static int[] reverseArray(int arr[]){
    //     int n = arr.length;
    //     int j=0;
    //     int ans[]= new int[n];
    //     for(int i=n-1; i>=0;i--){
    //         ans[j++]=arr[i];
    //     }
    //     return ans;
    // }

    static void swapinarray(int arr[],int i, int j){

        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
    static void reverseArray(int arr[]){
        int i=0 , j= arr.length -1 ;
        while(i<j){
            swapinarray(arr,i,j);
            i++;
            j--;
        }
    }

    static void printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static int[] rotate(int arr[], int k){
        int n = arr.length;
        k=k%n;
        int j =0; 
        int ans[]= new int[n];
        for(int i= n-k; i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0; i<n-k; i++){
            ans[j++]=arr[i];
        }
        return ans;

    }

    static void reverseArray2(int arr[] , int i, int j){
        while(i<j){
            swapinarray(arr,i,j);
            i++;
            j--;
        }
    }

    static void rotateinplace(int [] arr, int k){
        int n = arr.length;
        k=k%n;
        reverseArray2(arr, 0,n-k-1 );
        reverseArray2(arr, n-k, n-1);
        reverseArray2(arr, 0, n-1);        
    }

    static int [] frequencyarray( int arr[], int q ){
        int freq []= new int[100005];
        for(int i=0 ; i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
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
        // System.out.println("Enter the no. of times you want to rotate the array:");
        // int k = sc.nextInt();
        // System.out.println("Enter a:"); 
        // int a = sc.nextInt();
        // System.out.println("Enter b:");
        // int b = sc.nextInt();
        //swap(a, b);
        // System.out.println("original array:");
        // printarray(arr);
        // System.out.println("");
        // System.out.println("The rotated array is ");
        //int [] ans= rotate(arr,k);
        // rotateinplace(arr, k);
        System.out.println("enter the number of queries:");
        int q=sc.nextInt();
        int freq []= frequencyarray(arr, q);
        while(q>0){
            System.out.println("Enter number to be searched:");
            int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            q--;
        }
        // printarray(arr);
    }    
}