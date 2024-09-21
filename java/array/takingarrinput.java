import java.util.*;
public class takingarrinput {
    static void printarray(int [] arr)
    {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i<n; i++)
        {
         arr[i]= sc.nextInt();
        }
        System.out.println("The original array is:");
        printarray(arr);
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(arr[i]+ " " );
        // }
        int arr_2[]=Arrays.copyOf(arr, n);
        System.out.println("The array after copied:");
        printarray(arr_2);
        // System.out.println("The copied array is:");
        // for(int i =0; i<n; i++){
        //     System.out.println(arr_2[i]);
        // }
        System.out.println("copied array after changing some value:");
        arr_2[0]=0;
        arr_2[1]=0;
        printarray(arr_2);
        System.out.println("The original array is:");
        printarray(arr);
    }    
}